grails.project.class.dir = "target/classes"
grails.project.test.class.dir = "target/test-classes"
grails.project.test.reports.dir = "target/test-reports"

grails.project.dependency.resolution = {

    inherits 'global'

    log 'warn'

    repositories {
        grailsPlugins()
        grailsHome()
        grailsCentral()

        mavenCentral()
    }

    dependencies {
        runtime('com.googlecode.libphonenumber:libphonenumber:3.6') {
            transitive = false
        }
    }
}

coverage {
    enabledByDefault = true
}