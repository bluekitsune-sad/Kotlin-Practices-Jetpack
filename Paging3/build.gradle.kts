// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    id("com.android.application") version "8.1.0" apply false
    id("org.jetbrains.kotlin.android") version "1.8.10" apply false
    id("com.google.dagger.hilt.android") version "2.42" apply false
}
//buildscript {
//    ext {
//        var compose_version = "1.1.0-rc01"
//        var kotlin_version = "1.6.0"
//    }
//    repositories {
//        google()
//        mavenCentral()
//    }
//    dependencies {
//        classpath("com.android.tools.build:gradle:7.0.4")
//        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:$kotlin_version")
//        classpath("com.google.dagger:hilt-android-gradle-plugin:2.38.1")
//        classpath("org.jetbrains.kotlin:kotlin-serialization:$kotlin_version")
//
//        // NOTE: Do not place your application dependencies here; they belong
//        // in the individual module build.gradle files
//    }
//}
//
//task clean(type: Delete) {
//    delete rootProject.buildDir
//}