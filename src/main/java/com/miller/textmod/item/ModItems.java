package com.miller.textmod.item;

import com.miller.textmod.TextMod;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.GrassBlock;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item GRAPHITE = registerItems("graphite",new Item(new Item.Settings()));

    private static Item registerItems(String id, Item item){
        return Registry.register(Registries.ITEM, Identifier.of(TextMod.MOD_ID, id), item);
    }
    private static void addItemToIG(FabricItemGroupEntries fabricItemGroupEntries){
        fabricItemGroupEntries.add(GRAPHITE);
    }
    public static void registerModItems(){
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemToIG);
        TextMod.LOGGER.info("Registering Items");
    }
}
