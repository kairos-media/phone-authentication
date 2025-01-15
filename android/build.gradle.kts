// In android/build.gradle.kts (Project-level build script)
buildscript {
    repositories {
        google()
        mavenCentral()
    }
    dependencies {
        // Add the Google services classpath here
        classpath("com.google.gms:google-services:4.4.2") // Ensure the version is correct
    }
}

allprojects {
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.buildDir = file("../build")

subprojects {
    buildDir = file("${rootProject.buildDir}/$name")
}

subprojects {
    evaluationDependsOn(":app")
}

tasks.register<Delete>("clean") {
    delete(rootProject.buildDir)
}


