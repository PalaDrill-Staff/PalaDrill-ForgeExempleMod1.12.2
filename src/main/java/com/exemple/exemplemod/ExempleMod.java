package com.exemple.exemplemod;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;

@Mod(modid = "yourmodid", name = "YourModName", version = "1.0.0", acceptedMinecraftVersions = "1.12.2")
public class ExempleMod {
    public static final String MODID = "yourmodid";
    private static final Logger logger = LogManager.getLogger();


    @Mod.EventHandler
    public static void preInit(FMLPostInitializationEvent event) {
    }

    @Mod.EventHandler
    public static void postInit(FMLPostInitializationEvent event) {
    }

    public static Logger getLogger() {
    }
}
