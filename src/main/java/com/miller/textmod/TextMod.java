package com.miller.textmod;

import com.miller.textmod.block.ModBlocks;
import com.miller.textmod.item.ModItemGroups;
import com.miller.textmod.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TextMod implements ModInitializer {
	public static final String MOD_ID = "textmod";

	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		ModItems.registerModItems();
		ModItemGroups.registerModItemGroups();
		ModBlocks.registerModBlocks();
		LOGGER.info("Hello Fabric world!");
	}
}