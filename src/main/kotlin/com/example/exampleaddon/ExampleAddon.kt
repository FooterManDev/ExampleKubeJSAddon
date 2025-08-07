package com.example.exampleaddon

import net.minecraft.resources.ResourceLocation
import net.minecraftforge.eventbus.api.IEventBus
import net.minecraftforge.fml.common.Mod
import org.apache.logging.log4j.LogManager
import org.apache.logging.log4j.Logger

// You really don't need any of the mumbo-jumbo found here in other mods. Just the ID and Logger, plus some extra nice stuff.
// Having these outside the class will make them available globally without having to call the class.
const val ID = "exampleaddon"
val Logger: Logger = LogManager.getLogger(ID)
fun resource(path: String): ResourceLocation = ResourceLocation.fromNamespaceAndPath(ID, path)

@Mod("exampleaddon")
object ExampleAddon {

    init {
        Logger.info("Mod Loaded")
    }
}