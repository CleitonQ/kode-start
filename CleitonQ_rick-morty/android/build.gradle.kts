buildscript {
    repositories {
        google()
        mavenCentral()
    }
    dependencies {
        classpath("com.android.tools.build:gradle:7.0.4") // Isso pode causar erro se não estiver correto
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.5.21")
        // Erro de sintaxe aqui se não estiver corretamente configurado
    }
}
