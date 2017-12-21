<html>
    <head>
        <title>策划工具</title>
        <meta name="layout" content="main"/>
    </head>
    <body>
        <div class="m_design">
            <div class="page-header">
                <h2>策划导表重启等工具</h2>
            </div>
            <p>
                <button id="exportCsv" class="btn btn-info" type="button" onclick="${remoteFunction(action:'exportCsv',onSuccess:'onExportCsv(data)',onFailure:'onExportCsv(false)')}">开始导表</button>
                <button id="buildClientScript" class="btn btn-primary" type="button" onclick="${remoteFunction(action:'buildClientScript',onSuccess:'onBuildClientScript(data)',onFailure:'onBuildClientScript(false)')}">编译客户端脚本</button>
                <button id="buildClient" class="btn btn-danger" type="button" onclick="${remoteFunction(action:'buildClient',onSuccess:'onBuildClient(data)',onFailure:'onBuildClient(false)')}">编译完整客户端</button>
                <button id="restartServer" class="btn btn-danger" type="button" onclick="${remoteFunction(action:'restartServer',onSuccess:'onRestartServer(data)',onFailure:'onRestartServer(false)')}">重启服务器</button>
            </p>
            <p>
                <button id="packUi" class="btn btn-info" type="button" onclick="${remoteFunction(action:'packRes',params:'\'res=compress\'',onSuccess:'onPackRes(data)',onFailure:'onPackRes(false)')}">压缩图片</button>
                <button id="restartLoginAndGms" class="btn btn-danger" type="button" onclick="${remoteFunction(action:'restartLoginAndGms',onSuccess:'onRestartLoginAndGms(data)',onFailure:'onRestartLoginAndGms(false)')}">重启login/gms</button>
                 <button id="updateClient" class="btn btn-danger" type="button" onclick="${remoteFunction(action:'updateClient',onSuccess:'onUpdateClient(data)',onFailure:'onUpdateClient(false)')}">更新内网客户端</button>
                <!-- <button id="packUi" class="btn btn-info" type="button" onclick="${remoteFunction(action:'packRes',params:'\'res=ui\'',onSuccess:'onPackRes(data)',onFailure:'onPackRes(false)')}">打包UI</button>
                <button id="packUi" class="btn btn-info" type="button" onclick="${remoteFunction(action:'packRes',params:'\'res=icon\'',onSuccess:'onPackRes(data)',onFailure:'onPackRes(false)')}">打包Icon</button>
                <button id="packChar" class="btn btn-primary" type="button" onclick="${remoteFunction(action:'packRes',params:'\'res=char\'',onSuccess:'onPackRes(data)',onFailure:'onPackRes(false)')}">打包角色</button>
                <button id="packEffect" class="btn btn-primary" type="button" onclick="${remoteFunction(action:'packRes',params:'\'res=effect\'',onSuccess:'onPackRes(data)',onFailure:'onPackRes(false)')}">打包特效</button>
                <button id="packScene" class="btn btn-primary" type="button" onclick="${remoteFunction(action:'packRes',params:'\'res=scene\'',onSuccess:'onPackRes(data)',onFailure:'onPackRes(false)')}">打包场景</button>
                <button id="packAll" class="btn btn-danger" type="button" onclick="${remoteFunction(action:'packRes',params:'\'res=all\'',onSuccess:'onPackRes(data)',onFailure:'onPackRes(false)')}">全部打包</button> -->
            </p>
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