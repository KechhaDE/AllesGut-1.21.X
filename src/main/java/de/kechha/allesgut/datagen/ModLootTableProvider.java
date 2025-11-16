package de.kechha.allesgut.datagen;

import de.kechha.allesgut.block.ModBlocks;
import net.fabricmc.fabric.api.block.v1.FabricBlock;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class ModLootTableProvider extends FabricBlockLootTableProvider {
    public ModLootTableProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, registryLookup);
    }

    @Override
    public void generate() {
        addDrop(ModBlocks.BREWING_BARREL_BLOCK);
        addDrop(ModBlocks.VINEYARD_SOIL_BLOCK);
        addDrop(ModBlocks.VINEYARD_SOIL_SLAB, slabDrops(ModBlocks.VINEYARD_SOIL_SLAB));
        addDrop(ModBlocks.VINEYARD_SOIL_STAIRS);
    }
}
