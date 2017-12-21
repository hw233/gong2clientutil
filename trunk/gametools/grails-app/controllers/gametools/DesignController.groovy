package gametools

import grails.converters.JSON
import org.apache.commons.io.FileUtils

import utils.CookieUtils

class DesignController {
    def SCRIPT_DIR_PREFIX = 'scripts'
    def EXECUTE_SCRIPT = 'execute.sh'
    def EXPORT_CSV_JOB = 'csv2code.sh'
    def RESTART_SERVER_JOB = 'server.sh'
    def RESTART_LOGIN_AND_GMS_JOB = 'loginAndGms.sh'
    def UPDATE_CLIENT_JOB = 'updateClient.sh'
    def BUILD_CLIENT_SCRIPT_JOB = 'client_script.sh'
    def BUILD_CLIENT_JOB = 'client.sh'
    def BUILD_CLIENT_RES_JOB = 'client_res.sh'
    def jobIdx = 0
    def JOB_KEY = 'design'
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

    def exportCsv() {
        def logFileName = getLogFileName()
        def proc = ["bash", "-c", "cd ${SCRIPT_DIR_PREFIX}; ./${EXECUTE_SCRIPT} ${logFileName} ${EXPORT_CSV_JOB} &"].execute()
        render(proc.waitFor() == 0)
    }

    def restartServer() {
        def logFileName = getLogFileName()
        def proc = ["bash", "-c", "cd ${SCRIPT_DIR_PREFIX}; ./${EXECUTE_SCRIPT} ${logFileName} ${RESTART_SERVER_JOB} &"].execute()
        render(proc.waitFor() == 0)
    }


     def restartLoginAndGms() {
        def logFileName = getLogFileName()
        def proc = ["bash", "-c", "cd ${SCRIPT_DIR_PREFIX}; ./${EXECUTE_SCRIPT} ${logFileName} ${RESTART_LOGIN_AND_GMS_JOB} &"].execute()
        render(proc.waitFor() == 0)
    }

     def updateClient() {
        def logFileName = getLogFileName()
        def proc = ["bash", "-c", "cd ${SCRIPT_DIR_PREFIX}; ./${EXECUTE_SCRIPT} ${logFileName} ${UPDATE_CLIENT_JOB} &"].execute()
        render(proc.waitFor() == 0)
    }



    def buildClientScript() {
        def logFileName = getLogFileName()
        def proc = ["bash", "-c", "cd ${SCRIPT_DIR_PREFIX}; ./${EXECUTE_SCRIPT} ${logFileName} ${BUILD_CLIENT_SCRIPT_JOB} test &"].execute()
        render(proc.waitFor() == 0)
    }

    def buildClient() {
        def logFileName = getLogFileName()
        def proc = ["bash", "-c", "cd ${SCRIPT_DIR_PREFIX}; ./${EXECUTE_SCRIPT} ${logFileName} ${BUILD_CLIENT_JOB} test &"].execute()
        render(proc.waitFor() == 0)
    }

    def packRes() {
        def res = params.res
        if(res == null || res == "all") {
            res = ''
        }
        def proc = ["bash", "-c", "cd ${SCRIPT_DIR_PREFIX}; ./${EXECUTE_SCRIPT} ${logFileName} ${BUILD_CLIENT_RES_JOB} ${res} &"].execute()
        render(proc.waitFor() == 0)
    }

}
