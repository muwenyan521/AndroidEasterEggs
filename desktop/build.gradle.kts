plugins {
    alias(libs.plugins.kotlin.jvm)
    id("org.jetbrains.compose") version "1.6.0"
}

kotlin {
    // 明确禁用Native目标
    targets.all {
        compilations.all {
            compileTaskProvider.configure {
                onlyIf {
                    !targetName.toLowerCase().contains("native")
                }
            }
        }
    }
}

dependencies {
    implementation(compose.desktop.currentOs)
    implementation(project(":app"))
}

compose.desktop {
    application {
        mainClass = "com.dede.android_eggs.desktop.MainKt"
        targets = listOf(org.jetbrains.compose.desktop.application.dsl.Target.Windows)
        
        nativeDistributions {
            targetFormats(org.jetbrains.compose.desktop.application.dsl.TargetFormat.Msi, org.jetbrains.compose.desktop.application.dsl.TargetFormat.Exe)
            packageName = "Android Easter Eggs"
            packageVersion = "1.0.0"
        }
    }
}
