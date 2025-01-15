plugins {
    id("com.android.application")
    id("kotlin-android")
    // Flutter plugin applied after Android and Kotlin plugins.
    id("dev.flutter.flutter-gradle-plugin")
}

android {
    namespace = "com.example.my_flutter_app"
    compileSdk = 34  // You can replace this with flutter.compileSdkVersion if needed.
    ndkVersion = "21.3.6528147" // Specify NDK version, replace if needed.

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }

    kotlinOptions {
        jvmTarget = "17"
    }

    defaultConfig {
        applicationId = "com.example.my_flutter_app"
        minSdk = 23  // Replace this with flutter.minSdkVersion if needed.
        targetSdk = 34  // Replace this with flutter.targetSdkVersion if needed.
        versionCode = 1
        versionName = "1.0"
    }

    buildTypes {
        release {
            // Apply signingConfig for release if needed.
            signingConfig = signingConfigs.getByName("debug")
        }
    }
}

flutter {
    source = "../.."  // This points to your Flutter SDK or project directory.
}

dependencies {
    implementation("com.google.firebase:firebase-analytics-ktx:21.2.0")
    // Other Firebase dependencies
}

// Apply the Google services plugin after all dependencies and configuration
apply(plugin = "com.google.gms.google-services")


