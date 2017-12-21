<html>
    <head>
        <title>发布工具</title>
        <meta name="layout" content="main"/>
    </head>
    <body>
        <div class="m_design">
            <div class="page-header">
                <h2>发布各平台客户端
                    <button id="buildClientScript" class="btn btn-info" type="button" onclick="${remoteFunction(action:'updateTools',onSuccess:'onUpdateTools(data)',onFailure:'onUpdateTools(false)')}">更新发布工具</button>
                </h2>
            </div>
            <p>
                <button id="encodePic" class="btn btn-primary" type="button" onclick="${remoteFunction(action:'encodePic', onSuccess:'onEncodePic(data)',onFailure:'onEncodePic(false)')}">加密图片（发布前必须先加密）</button>
            </p>
            <g:each in="${sdks}" var="sdk">
            <p>
                <button id="buildClientScript" class="btn btn-primary" type="button" onclick="${remoteFunction(action:'buildClientScript',params:'\'opr=\' + this.value',onSuccess:'onBuildClientScript(data)',onFailure:'onBuildClientScript(false)')}" value="${sdk.opr}" ${sdk.disabled?"disabled=\"disabled\"":""}>发布更新资源: ${sdk.name} (${sdk.opr})</button>
                <button id="buildClient" class="btn btn-danger" type="button" onclick="${remoteFunction(action:'buildClient',params:'\'opr=\' + this.value',onSuccess:'onBuildClient(data)',onFailure:'onBuildClient(false)')}" value="${sdk.opr}" ${sdk.disabled?"disabled=\"disabled\"":""}>发布完整客户端: ${sdk.name} (${sdk.opr})</button>
                <a href="http://appdown.030303.com/apps/${sdk.opr}" target="_blank">下载地址: ${sdk.name} (${sdk.opr})</a>
            </p>
            </g:each>
            <div class="panel panel-default">
                <div id="log_content" class="panel-body log"></div>
            </div>
            <p>
                <div class="pull-right">
                    <button class="btn btn-default" type="button" onclick="toggleScroll(this);">自动滚动</button>
                    <button class="btn btn-info" type="button" onclick="${remoteFunction(action:'clearLog',onSuccess:'onClearLog(data)',onFailure:'onClearLog(null)')}">清空日志</button>
                </div>
                <div class="clearfix"></div>
            </p>
        </div>
        <r:script disposition="defer">
            $(document).ready(function() {
                startMonitor("${createLink(action:'monitorLog')}");
            });
        </r:script>
    </body>
</html>