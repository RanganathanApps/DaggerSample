// Top-level build file where you can add configuration options common to all sub-projects/modules.

buildscript {

    val kotlin_v ="1.3.50"
    val build_gtradle_v ="3.5.2"

    repositories {
        google()
        jcenter()

    }
    dependencies {
        classpath("com.android.tools.build:gradle:$build_gtradle_v")
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:$kotlin_v")
        // NOTE: Do not place your application dependencies here; they belong
        // in the individual module build.gradle files
    }
}

allprojects {
    repositories {
        mavenLocal()
        google()
        jcenter()
        maven(url = "https://jitpack.io")

    }
}

/*task clean(type: Delete) {
    delete rootProject.buildDir
}*/
