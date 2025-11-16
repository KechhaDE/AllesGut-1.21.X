package de.kechha.allesgut;

import de.kechha.allesgut.block.ModBlocks;
import de.kechha.allesgut.item.ModItemGroups;
import de.kechha.allesgut.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AllesGut implements ModInitializer {
	public static final String MOD_ID = "allesgut";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    // Test
	@Override
	public void onInitialize() {

		LOGGER.info("Kechha.AllesGut loaded!");
        ModItems.registerModItems();
        ModBlocks.registerModBlocks();
        ModItemGroups.registerItemGroups();
	}
}