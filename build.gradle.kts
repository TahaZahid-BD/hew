// Top-level build file where you can add configuration options common to all sub-projects/modules.
buildscript {
    repositories {
        google()
        mavenCentral()
        maven {
            url = uri("https://maven.google.com/")
            name = "Google"
        }
        maven { url = uri("https://jitpack.io") }
        mavenCentral()
    }
    dependencies {
        val nav_version = "2.7.6"
        classpath ("com.android.tools.build:gradle:7.0.4")
        classpath ("com.google.dagger:hilt-android-gradle-plugin:2.50")
        classpath("androidx.navigation:navigation-safe-args-gradle-plugin:$nav_version")
    }
}


plugins {
    id ("com.android.application") version "7.4.2" apply false
    id ("com.android.library") version "7.4.2" apply false
    id ("org.jetbrains.kotlin.android") version "1.8.0" apply false
    id ("org.jetbrains.kotlin.jvm") version "1.5.21" apply false
    id ("com.google.dagger.hilt.android") version "2.50" apply false
}