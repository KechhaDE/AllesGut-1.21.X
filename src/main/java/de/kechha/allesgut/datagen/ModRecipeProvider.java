package de.kechha.allesgut.datagen;

import de.kechha.allesgut.block.ModBlocks;
import de.kechha.allesgut.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.fabricmc.fabric.api.recipe.v1.ingredient.FabricIngredient;
import net.minecraft.data.server.recipe.CraftingRecipeJsonBuilder;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.item.ItemStack;
import net.minecraft.recipe.Ingredient;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;

import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends FabricRecipeProvider {

    public ModRecipeProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    public void generate(RecipeExporter exporter) {

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.BREWING_BARREL_BLOCK)
                .pattern("PSP")
                .pattern("PGP")
                .pattern("PSP")
                .input('P', ItemTags.PLANKS)
                .input('S', ItemTags.WOODEN_SLABS)
                .input('G', ModItems.RED_GRAPE)
                .criterion(hasItem(ModItems.RED_GRAPE), conditionsFromItem(ModItems.RED_GRAPE))
                .offerTo(exporter);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.VINEYARD_SOIL_SLAB, ModBlocks.VINEYARD_SOIL_BLOCK);
        createStairsRecipe(ModBlocks.VINEYARD_SOIL_STAIRS, Ingredient.ofItems(ModBlocks.VINEYARD_SOIL_BLOCK))
                .criterion(hasItem(ModBlocks.BREWING_BARREL_BLOCK), conditionsFromItem(ModBlocks.VINEYARD_SOIL_BLOCK))
                .offerTo(exporter);

    }
}
