@file:Suppress("UnstableApiUsage")

pluginManagement {
    includeBuild("build-logic")
    repositories {
        google {
            content {
                includeGroupByRegex("com\\.android.*")
                includeGroupByRegex("com\\.google.*")
                includeGroupByRegex("androidx.*")
            }
        }
        gradlePluginPortal()
        mavenCentral()
    }
}

dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
        maven { setUrl("https://jitpack.io") }
    }
}

include(
    ":app",

    ":core:composable",
    ":core:theme",
    ":core:navigation",
    ":core:local-provider",
    ":core:resources",
    ":core:icons",
    ":core:activity-actions",
    ":core:settings",
    ":core:shortcut",
    ":core:alterable-adaptive-icon",
    ":core:custom-tab-browser",

    ":feature:cat-editor",
    ":feature:widget",
    ":feature:crash",
    ":feature:embedding-splits",

    ":basic",
    ":jvm-basic",
    ":desktop",

    ":eggs:Base",
    ":eggs:Gingerbread",
    ":eggs:Honeycomb",
    ":eggs:IceCreamSandwich",
    ":eggs:JellyBean",
    ":eggs:KitKat",
    ":eggs:Lollipop",
    ":eggs:Marshmallow",
    ":eggs:Nougat",
    ":eggs:Oreo",
    ":eggs:Pie",
    ":eggs:Q",
    ":eggs:R",
    ":eggs:S",
    ":eggs:Tiramisu",
    ":eggs:UpsideDownCake",
    ":eggs:VanillaIceCream",
    ":eggs:Baklava",
    ":eggs:AndroidNext",
    ":eggs:RocketLauncher",

    ":script:compose-material-icons-generator",
    ":script:emoji-svg-xml-convertor",
)
rootProject.name = "Easter Eggs"
