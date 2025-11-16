package de.kechha.allesgut.item;

import de.kechha.allesgut.AllesGut;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registry;
import net.minecraft.registry.Registries;
import net.minecraft.util.Identifier;

public class ModItems {

    public static final Item RED_GRAPE = registerItem("red_grape", new Item(new Item.Settings()));
    public static final Item GRAPE = registerItem("grape", new Item(new Item.Settings()));

    private static Item registerItem(String name, Item item) {

        return Registry.register(Registries.ITEM,
                Identifier.of(AllesGut.MOD_ID, name), item);
    }

    public static void registerModItems() {
        AllesGut.LOGGER.info("Registering Items for " + AllesGut.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FOOD_AND_DRINK).register(entries -> {
            entries.add(RED_GRAPE);
        });
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FOOD_AND_DRINK).register(entries -> {
           entries.add(GRAPE);
        });

    }

}
