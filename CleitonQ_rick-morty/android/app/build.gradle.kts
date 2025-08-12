android {
    namespace = "com.example.rick_morty"
    compileSdk = flutter.compileSdkVersion

    // Atualize para a versão 27.0.12077973 do NDK
    ndkVersion "27.0.12077973"

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }

    kotlinOptions {
        jvmTarget = JavaVersion.VERSION_11.toString()
    }

    defaultConfig {
        applicationId = "com.example.rick_morty"
        minSdk = 21 // Ou o valor que você escolheu
        targetSdk = 33 // Android 13 (correspondente ao Edge 30 Pro)
        versionCode = flutter.versionCode
        versionName = flutter.versionName
    }

    signingConfigs {
        release {
            storeFile = file("path/to/your-release-key.jks")
            storePassword = "your-keystore-password"
            keyAlias = "your-key-alias"
            keyPassword = "your-key-password"
        }
    }

    buildTypes {
        release {
            signingConfig = signingConfigs.release
        }
    }
}
