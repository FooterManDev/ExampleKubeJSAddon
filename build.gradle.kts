import java.text.SimpleDateFormat
import java.util.Date

val modVersion:      String by project
val mavenGroup:      String by project
val modID:           String by project
val modName:         String by project
val modDesc:         String by project
val modAuthor:       String by project
val modLicense:      String by project
val modIssuesSource: String by project

plugins {
    alias(mod.plugins.kotlin)
    alias(mod.plugins.cloche)
}

base { archivesName.set(modID) }

sourceSets {
    main {
        resources {
            setSrcDirs(listOf("src/main/resources"))
        }
    }
}

version = modVersion
group = mavenGroup

repositories {
    cloche.librariesMinecraft()
    mavenCentral()

    /* Cloche */
    cloche {
        main()
        mavenForge()
        mavenParchment()
    }

    /* KubeJS */
    maven {
        name = "Lat's Maven (Rhino, KubeJS)"
        url  = uri("https://maven.latvian.dev/releases")
        content { includeGroup("dev.latvian.mods") }
    }

    maven {
        name = "Architectury Maven (For KubeJS)"
        url = uri("https://maven.architectury.dev")
        content { includeGroup("dev.architectury") }
    }

    /* KotlinForForge */
    maven {
        name = "DarkColour's Maven (KotlinForForge)"
        url  = uri("https://thedarkcolour.github.io/KotlinForForge/")
        content { includeGroup("thedarkcolour") }
    }
}

dependencies {
    /* KubeJS */
    compileOnly(mod.mixinextras.common)
    annotationProcessor(mod.mixinextras.common)
    implementation(mod.mixinextras.forge)

    /* Kotlin */
    implementation(mod.kotlinforforge)
}

cloche {
    minecraftVersion = mod.versions.minecraft

    mappings {
        official()
        parchment("2023.09.03")
    }

    metadata {
        modId       = modID
        name        = modName
        description = modDesc
        license     = modLicense
        issues      = modIssuesSource
        icon        = "icon.png"

        author(modAuthor)
    }

    singleTarget {
        forge {
            loaderVersion = mod.versions.forge

            metadata {
                modLoader = "kotlinforforge"
                loaderVersion("4.11")

                /* Mod dependencies */
                dependency {
                    modId = "kubejs"
                    required = true
                    version("*")
                }
            }

            /* Gradle dependencies */
            dependencies {
                modCompileOnly(mod.mixinextras.common)
                modImplementation(mod.mixinextras.forge)
                modImplementation(mod.kotlinforforge)
                modImplementation(mod.kubejs)
            }

            runs {
                client()
                server()
                data()
            }

            data()
        }
    }
}

tasks.withType<ProcessResources>() {
    val replProps = mapOf(
        "mod_id"      to modID,
        "mod_name"    to modName,
        "mod_version" to modVersion,
        "mod_authors" to modAuthor
    )

    replProps.forEach { (k, v) -> println("\t -> $k = $v") }
    inputs.properties(replProps)

    filteringCharset = "UTF-8"

    filesMatching("META-INF/mods.toml") {
        expand(replProps + mapOf("project" to project))
    }
}

tasks.withType<JavaCompile>().configureEach {
    options.release.set(17)
}

java {
    withSourcesJar()
    sourceCompatibility = JavaVersion.VERSION_17
    targetCompatibility = JavaVersion.VERSION_17
}

tasks.jar {
    manifest {
        attributes(
                "Specification-Title"      to modID,
                "Specification-Vendor"     to modAuthor,
                "Specification-Version"    to "1",
                "Implementation-Title"     to modName,
                "Implementation-Version"   to version,
                "Implementation-Vendor"    to modAuthor,
                "Implementation-Timestamp" to SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZ").format(Date())
        )
    }
}

kotlin {
    jvmToolchain(17)
}