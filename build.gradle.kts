import java.text.SimpleDateFormat
import java.util.Date

val modVersion: String by project
val mavenGroup: String by project
val modId: String by project
val modName: String by project
val modAuthors: String by project

plugins {
    alias(mod.plugins.kotlin)
    alias(mod.plugins.loom)
}

base { archivesName.set(modId) }

sourceSets {
    main {
        resources {
            setSrcDirs(listOf("src/main/resources"))
        }
    }
}

version = modVersion
group = mavenGroup

loom {
    silentMojangMappingsLicense()
}

repositories {
    maven {
        name = "Lat's Maven (Rhino, KubeJS)"
        url  = uri("https://maven.latvian.dev/releases")
        content { includeGroup("dev.latvian.mods") }
    }

    maven {
        name = "DarkColour's Maven (KotlinForForge)"
        url  = uri("https://thedarkcolour.github.io/KotlinForForge/")
        content { includeGroup("thedarkcolour") }
    }


}

dependencies {
    /* Minecraft and Forge */
    minecraft(mod.minecraft)
    mappings(loom.officialMojangMappings())
    forge(mod.forge)

    /* KubeJS */
    modImplementation(mod.kubejs)
    compileOnly(mod.mixinextras.common)
    annotationProcessor(mod.mixinextras.common) // MixinExtras is set this way due to Gradle not supporting it's own catalog system.
    implementation(mod.mixinextras.forge)
    include(mod.mixinextras.forge)

    /* Kotlin */
    implementation(mod.kotlinforforge)


}

tasks.withType<ProcessResources>() {
    val replProps = mapOf(
        "mod_id"      to modId,
        "mod_name"    to modName,
        "mod_version" to modVersion,
        "mod_authors"  to modAuthors
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
                "Specification-Title"      to modId,
                "Specification-Vendor"     to modAuthors,
                "Specification-Version"    to "1",
                "Implementation-Title"     to modName,
                "Implementation-Version"   to version,
                "Implementation-Vendor"    to modAuthors,
                "Implementation-Timestamp" to SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZ").format(Date())
        )
    }
}

kotlin {
    jvmToolchain(17)
}