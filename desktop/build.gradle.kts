plugins {
    alias(libs.plugins.kotlin.jvm)
    id("org.jetbrains.compose") version "1.5.10"
}

dependencies {
    implementation(compose.desktop.currentOs)
    implementation(project(":app"))
}

compose.desktop {
    application {
        mainClass = "com.dede.android_eggs.desktop.MainKt"
        
        nativeDistributions {
            targetFormats(org.jetbrains.compose.desktop.application.dsl.TargetFormat.Msi, org.jetbrains.compose.desktop.application.dsl.TargetFormat.Exe)
            packageName = "Android Easter Eggs"
            packageVersion = "1.0.0"
        }
    }
}
