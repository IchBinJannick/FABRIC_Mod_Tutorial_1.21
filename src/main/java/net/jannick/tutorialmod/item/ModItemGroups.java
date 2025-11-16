package net.jannick.tutorialmod.item;

import net.fabricmc.fabric.api.item.v1.FabricItem;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.jannick.tutorialmod.TutorialMod;
import net.jannick.tutorialmod.block.ModBlocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup TUTORIAL_MOD_ITEMS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(TutorialMod.MOD_ID, "tutorial_mod_items"),
            FabricItemGroup.builder()
                    .icon(() -> new ItemStack(ModItems.PINK_GARNET))
                    .displayName(Text.translatable("itemgroup.tutorialmod.tutorial_mod_items"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.PINK_GARNET);
                        entries.add(ModItems.RAW_PINK_GARNET);
                        entries.add(ModItems.CHISEL);
                    }).build());

    public static final ItemGroup TUTORIAL_MOD_BLOCKS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(TutorialMod.MOD_ID, "tutorial_mod_blocks"),
            FabricItemGroup.builder()
                    .icon(() -> new ItemStack(ModBlocks.PINK_GARNET_BLOCK))
                    .displayName(Text.translatable("itemgroup.tutorialmod.tutorial_mod_blocks"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModBlocks.PINK_GARNET_BLOCK);
                        entries.add(ModBlocks.RAW_PINK_GARNET_BLOCK);
                        entries.add(ModBlocks.PINK_GARNET_ORE);
                        entries.add(ModBlocks.PINK_GARNET_DEEPSLATE_ORE);
                        entries.add(ModBlocks.MAGIC_BLOCK);
                        entries.add(ModBlocks.PINK_GARNET_STAIRS);
                        entries.add(ModBlocks.PINK_GARNET_SLAB);
                        entries.add(ModBlocks.PINK_GARNET_WALL);
                        entries.add(ModBlocks.PINK_GARNET_FENCE);
                        entries.add(ModBlocks.PINK_GARNET_FENCE_GATE);
                        entries.add(ModBlocks.PINK_GARNET_DOOR);
                        entries.add(ModBlocks.PINK_GARNET_TRAPDOOR);
                        entries.add(ModBlocks.PINK_GARNET_BUTTON);
                        entries.add(ModBlocks.PINK_GARNET_PRESSURE_PLATE);

                    }).build());

    public static final ItemGroup TUTORIAL_MOD_CONSUMABLES_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(TutorialMod.MOD_ID, "tutorial_mod_consumables"),
            FabricItemGroup.builder()
                    .icon(() -> new ItemStack(ModItems.CAULIFLOWER))
                    .displayName(Text.translatable("itemgroup.tutorialmod.tutorial_mod_consumables"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.CAULIFLOWER);
                        entries.add(ModItems.STARLIGHT_ASHES);
                    }).build());

    public static void registerItemGroups() {
        TutorialMod.LOGGER.info("Registering Item Group for: " + TutorialMod.MOD_ID);
    }
}
