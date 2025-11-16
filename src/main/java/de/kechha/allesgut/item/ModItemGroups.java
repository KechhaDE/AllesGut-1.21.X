package de.kechha.allesgut.item;

import de.kechha.allesgut.AllesGut;
import de.kechha.allesgut.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {

    public static final ItemGroup WINEMAKER_ITEMS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(AllesGut.MOD_ID, "winemaker_items"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.RED_GRAPE))
                    .displayName(Text.translatable("itemgroup.allesgut.winemaker_items"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.RED_GRAPE);
                        entries.add(ModItems.GRAPE);
                    }).build());

    public static final ItemGroup WINEMAKER_BLOCKS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(AllesGut.MOD_ID, "winemaker_blocks"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModBlocks.BREWING_BARREL_BLOCK))
                    .displayName(Text.translatable("itemgroup.allesgut.winemaker_blocks"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModBlocks.VINEYARD_SOIL_BLOCK);
                        entries.add(ModBlocks.BREWING_BARREL_BLOCK);
                    }).build());

    public static void registerItemGroups() {
        AllesGut.LOGGER.info("Registering Item Groups for " + AllesGut.MOD_ID);
    }
}
