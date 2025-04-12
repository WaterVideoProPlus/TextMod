package com.miller.textmod.item;

import com.miller.textmod.TextMod;
import com.miller.textmod.block.ModBlocks;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup TEXT_GROUP = Registry.register(Registries.ITEM_GROUP, Identifier.of(TextMod.MOD_ID,"text_group"),
        ItemGroup.create(null,-1).displayName(Text.translatable("itemGroup.text_group"))
                .icon(() -> new ItemStack(ModItems.GRAPHITE))
                .entries((displayContext, entries) -> {

                    entries.add(ModItems.GRAPHITE);

                    entries.add(ModBlocks.GRAPHITE_BLOCK);
                    entries.add(ModBlocks.GRAPHITE_ORE);

                    entries.add(Items.COAL);
                    entries.add(Items.GOLD_INGOT);
                    entries.add(Items.NETHERITE_PICKAXE);

                }).build());
    public static void registerModItemGroups(){
        TextMod.LOGGER.info("Registering Item Groups");
    }
}
