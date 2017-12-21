package gametools

import grails.converters.JSON
import org.apache.commons.io.FileUtils

import utils.CookieUtils

class ReleaseController {
    def SCRIPT_DIR_PREFIX = 'scripts'
    def EXECUTE_SCRIPT = 'execute.sh'
    def BUILD_CLIENT_SCRIPT_JOB = 'client_script.sh'
    def BUILD_CLIENT_JOB = 'client.sh'
    def ENCODE_PIC = 'client_encode_pic.sh'
    def UPDATE_TOOLS_JOB = 'update_tools.sh public'
    def UPDATE_REFRESH_JOB = 'update_refresh.sh public'
    def jobIdx = 0
    def JOB_KEY = 'release'
    def MAX_LINES = 1000

    def beforeInterceptor = [action: this.&checkCookie, except: '']

    private def checkCookie() {
        def jobUser = CookieUtils.getCookieValue(request, JOB_KEY)
        if(jobUser == null) {
            jobUser = JOB_KEY + '_' + (System.currentTimeMillis() / 1000 as int) + '_' + (++jobIdx)
            CookieUtils.addNonSpecCookie(response, JOB_KEY, jobUser, null, 3600 * 24 * 365, '/')
        }
        params.jobUser = jobUser

        return true
    }

    private def getLogFileName() {
        return 'job_' + params.jobUser + '.log'
    }


    private def getLogFilePath() {
        return SCRIPT_DIR_PREFIX + '/' + getLogFileName()
    }

    def index() {
        def proc = ["bash", "-c", "cd ${SCRIPT_DIR_PREFIX}; ./${UPDATE_REFRESH_JOB}"].execute()
        def lines = proc.text.split("\n")
        def sdks = []
        lines.each { line ->
            def info = line.tokenize(",")
            sdks << [opr: info[0], name: info[1], disabled: info[2] == "true"]
        }
        return [sdks: sdks]
    }

    def monitorLog() {
        def pos = params.pos as int
        def content = ""
        def success = true
        def logFile
        try {
            def file = new File(getLogFilePath())
            if(file.exists() && file.lastModified() < (System.currentTimeMillis() - 3600 * 1 * 1000)) {
                file.delete()
                pos = 0
            }
            if(file.exists()) {
                logFile = new RandomAccessFile(file, "r")
                logFile.seek(pos)
                def line
                def i = 0
                while((line = logFile.readLine()) != null) {
                    content += new String(line.getBytes("ISO-8859-1"),"UTF-8") + "\n"
                    if(++i >= MAX_LINES) {
                        break
                    }
                }
                pos = logFile.filePointer
            } else {
                pos = 0
            }
        } catch(e){
            success = false
        } finally{
            logFile?.close()
        }
        def result = [content: content, pos: pos, success: success]
        render result as JSON
    }

    def clearLog() {
        new File(getLogFilePath()).delete()
        render("true")
    }

    def updateTools() {
        def logFileName = getLogFileName()
        def proc = ["bash", "-c", "cd ${SCRIPT_DIR_PREFIX}; ./${EXECUTE_SCRIPT} ${logFileName} ${UPDATE_TOOLS_JOB} &"].execute()
        render(proc.waitFor() == 0)
    }

    def buildClientScript() {
        if(params.opr == null || params.opr.trim().length() == 0) {
            render("false")
            return
        }
        def logFileName = getLogFileName()
        def opr = params.opr.trim()
        def proc = ["bash", "-c", "cd ${SCRIPT_DIR_PREFIX}; ./${EXECUTE_SCRIPT} ${logFileName} ${BUILD_CLIENT_SCRIPT_JOB} ${opr} &"].execute()
        render(proc.waitFor() == 0)
    }

    def buildClient() {
        if(params.opr == null || params.opr.trim().length() == 0) {
            render("false")
            return
        }
        def logFileName = getLogFileName()
        def opr = params.opr.trim()
        def proc = ["bash", "-c", "cd ${SCRIPT_DIR_PREFIX}; ./${EXECUTE_SCRIPT} ${logFileName} ${BUILD_CLIENT_JOB} ${opr} &"].execute()
        render(proc.waitFor() == 0)
    }

    def encodePic() {
        def logFileName = getLogFileName()
        def proc = ["bash", "-c", "cd ${SCRIPT_DIR_PREFIX}; ./${EXECUTE_SCRIPT} ${logFileName} ${ENCODE_PIC} &"].execute()
        render(proc.waitFor() == 0)
    }

}
