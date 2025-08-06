pluginManagement {
    repositories {
        maven(url = "https://maven.msrandom.net/repository/cloche")
        gradlePluginPortal()
    }
}

dependencyResolutionManagement {
    versionCatalogs {
        create("mod") {
            from(files("mod.versions.toml")) }
    }
}
