rootProject.name = "gradle101"

pluginManagement {
    repositories {
        gradlePluginPortal()
        google()
    }
    includeBuild("../plugin-logic")
}

dependencyResolutionManagement {
    repositories {
        mavenCentral()
    }

    includeBuild("../gradle-102")
}

//include("app")
//include("business-logic")
//include("data-model")

rootDir.listFiles().filter { it.isDirectory && !it.isHidden }
        .forEach {
            include(it.name)
        }