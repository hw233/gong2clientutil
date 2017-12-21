<!DOCTYPE html>
<html lang="zh-CN">
    <head>
        <meta name="format-detection" content="telephone=no">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
        <title><g:layoutTitle default="游戏工具"/></title>
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="shortcut icon" href="${resource(dir: 'images', file: 'favicon.ico')}" type="image/x-icon">
        <link rel="apple-touch-icon" href="${resource(dir: 'images', file: 'apple-touch-icon.png')}">
        <link rel="apple-touch-icon" sizes="114x114" href="${resource(dir: 'images', file: 'apple-touch-icon-retina.png')}">
        <r:require modules="bootstrap, application"/>
        <g:layoutHead/>
        <r:layoutResources />
        <!--[if lt IE 9]>
        <script src="${resource(dir: 'js', file: 'html5shiv.min.js')}" type="text/javascript" ></script>
        <script src="${resource(dir: 'js', file: 'respond.min.js')}" type="text/javascript" ></script>
        <![endif]-->
    </head>
    <body>
        <div class="navbar navbar-inverse navbar-fixed-top" role="navigation">
            <div class="container">
                <div class="navbar-header">
                    <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
                        <span class="sr-only">Toggle navigation</span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                    </button>
                    <g:link class="navbar-brand" uri="/">游戏工具</g:link>
                </div>
                <div class="navbar-collapse collapse">
                    <ul class="nav navbar-nav">
                        <li class="${controllerName=='design'?'active':''}"><g:link controller="design">策划工具</g:link></li>
                        <li class="${controllerName=='qa'?'active':''}"><g:link controller="qa">QA工具</g:link></li>
                        <li class="${controllerName=='release'?'active':''}"><g:link controller="release">发布工具</g:link></li>
                        <li><a href="http://60.191.99.211:81/apps/test/" target="_blank">本地测试版安装</a></li>
                    </ul>
                    <ui class="nav navbar-nav navbar-right">
                        <li>
                            <sec:ifLoggedIn>
                                <g:link controller='logout'><sec:username/> (退出)</g:link>
                            </sec:ifLoggedIn>
                            <sec:ifNotLoggedIn>
                                <g:link controller='login' action='auth'>登陆</g:link>
                            </sec:ifNotLoggedIn>
                        </li>
                    </ui>
                </div><!--/.nav-collapse -->
            </div>
        </div>
        <div class="container">
        <g:layoutBody/>
        </div><!-- /.container -->
        <div id="spinner" class="spinner" style="display:none;"><g:message code="spinner.alt" default="Loading&hellip;"/></div>
        <r:layoutResources />
    </body>
</html>