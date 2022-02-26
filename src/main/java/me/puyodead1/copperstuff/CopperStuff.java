package me.puyodead1.copperstuff;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import me.puyodead1.copperstuff.registry.ItemRegistry;
import net.fabricmc.api.ModInitializer;
import net.minecraft.util.Identifier;

public class CopperStuff implements ModInitializer {
	public static final String MOD_ID = "copperstuff";
	public static final String MOD_NAME = "CopperStuff";

	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ItemRegistry.init();
	}

	public static Identifier id(String path) {
		return new Identifier(MOD_ID, path);
	}
}
