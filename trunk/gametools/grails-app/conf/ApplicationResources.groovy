modules = {
    overrides {
        jquery {
            resource id:'js', disposition:'defer'
        }
    }
    bootstrap {
        dependsOn 'jquery'
        resource url:'js/bootstrap.min.js'
        resource url:'css/bootstrap.min.css'
    }
    application {
        dependsOn 'jquery'
        resource url:'js/application.js'
        resource url:'css/m.css'
    }
}