buildscript {
    repositories {
        jcenter()
    }
    dependencies {
        classpath("javax.annotation:javax.annotation-api:1.3.2")
    }
}


plugins {
    application
    java
    id("no.nils.wsdl2java") version "0.12"
}

repositories {
    jcenter()
}

dependencies {
    implementation("com.sun.xml.ws:jaxws-ri:2.3.3")

    implementation("javax.xml.bind:jaxb-api:2.3.1")
    implementation("javax.xml.ws:jaxws-api:2.3.1")
    implementation("org.glassfish.jaxb:jaxb-runtime:2.3.2")
    implementation("org.glassfish.main.javaee-api:javax.jws:3.1.2.2")
    implementation("com.sun.xml.messaging.saaj:saaj-impl:1.5.1")

    implementation("org.apache.axis2:axis2:1.7.9")
    implementation("org.apache.axis2:axis2-kernel:1.7.9")
    implementation("org.apache.axis2:axis2-adb:1.7.9")
    implementation("org.apache.axis2:axis2-transport-local:1.7.9")
    implementation("org.apache.axis2:axis2-transport-http:1.7.9")
    implementation("org.apache.ws.commons.axiom:axiom-jaxb:1.2.22")

    testImplementation("junit:junit:4.13")
}

application {
    // Define the main class for the application.
    mainClass.set("dev.rmuhamedgaliev.app.App")
}

extra["cxfVersion"] = "3.4.0"
extra["cxfPluginVersion"] = "3.4.0"

wsdl2java {
    wsdlDir = file("$projectDir/src/wsdl")
    wsdlsToGenerate = listOf(
        listOf(
            "-client",
            "-autoNameResolution",
            "-wsdlLocation",
            "$projectDir/src/wsdl/MLService.wsdl",
            "$projectDir/src/wsdl/MLService.wsdl"
        )
    )
}
