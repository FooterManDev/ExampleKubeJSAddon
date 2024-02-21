package com.example.exampleaddon;

import net.minecraftforge.fml.common.Mod;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(ExampleAddon.ID)
public class ExampleAddon {

    // You really don't need any of the mumbo-jumbo found here in other mods. Just the ID and Logger.
    public static final String ID = "exampleaddon";
    public static final Logger LOGGER = LogManager.getLogger();

}
