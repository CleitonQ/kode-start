pluginManagement {
    val flutterSdkPath = run {
        val properties = java.util.Properties()
        file("local.properties").inputStream().use { properties.load(it) }
        val flutterSdkPath = properties.getProperty("flutter.sdk")
        require(flutterSdkPath != null) { "flutter.sdk not set in local.properties" }
        flutterSdkPath
    }

    // Removido o includeBuild para evitar problemas de configuração com o Flutter SDK
    // includeBuild("$flutterSdkPath/packages/flutter_tools/gradle")

    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}

plugins {
    // Android Gradle Plugin (especificando a versão correta)
    id("com.android.application") version "8.7.3" apply false

    // Kotlin Android Plugin, compatível com o Android Gradle Plugin
    id("org.jetbrains.kotlin.android") version "1.5.21" apply false  // Usando uma versão mais estável do Kotlin
}

include(":app")
