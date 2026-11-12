plugins {
    id("com.android.application")
}

android {
    namespace = "nl.samenwijs.app"
    compileSdk = 37

    defaultConfig {
        applicationId = "nl.samenwijs.app"
        minSdk = 26
        targetSdk = 35
        versionCode = 1
        versionName = "1.0.0"
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
}
