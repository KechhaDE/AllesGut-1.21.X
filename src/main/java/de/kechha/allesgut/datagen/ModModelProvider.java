package de.kechha.allesgut.datagen;

import de.kechha.allesgut.block.ModBlocks;
import de.kechha.allesgut.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;

public class ModModelProvider extends FabricModelProvider {

    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        BlockStateModelGenerator.BlockTexturePool vineyardSoilPool
                = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.VINEYARD_SOIL_BLOCK);

        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.BREWING_BARREL_BLOCK);

        vineyardSoilPool.slab(ModBlocks.VINEYARD_SOIL_SLAB);
        vineyardSoilPool.stairs(ModBlocks.VINEYARD_SOIL_STAIRS);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.GRAPE, Models.GENERATED);
        itemModelGenerator.register(ModItems.RED_GRAPE, Models.GENERATED);
    }
}
