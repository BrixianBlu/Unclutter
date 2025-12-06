package net.blu.unclutter;

import net.minecraft.block.*;
import net.minecraft.block.piston.PistonBehavior;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.DyeColor;
import net.minecraft.util.Identifier;

import static net.minecraft.block.Blocks.*;

public class UnclutterBlocks {
    public static final Block LEATHER_BLOCK = registerBlock("leather_block",
            new Block(AbstractBlock.Settings.create().sounds(BlockSoundGroup.WOOL).strength(0.2f)));
    public static final Block FEATHER_BLOCK = registerBlock("feather_block",
            new Block(AbstractBlock.Settings.copy(UnclutterBlocks.LEATHER_BLOCK)));
    public static final Block TURTLE_EGG_BLOCK = registerBlock("giant_turtle_egg",
            new Block(AbstractBlock.Settings.create().strength(0.4f).sounds(BlockSoundGroup.PACKED_MUD)));
    public static final Block SUGAR_CANE_BLOCK = registerBlock("sugar_cane_block",
            new Block(AbstractBlock.Settings.create().strength(0.2f).sounds(BlockSoundGroup.CROP)));
    public static final Block FLOWER_POT_BLOCK = registerBlock("flower_pot_block",
            new Block(AbstractBlock.Settings.create().sounds(BlockSoundGroup.DECORATED_POT).strength(0.8f)));
    public static final Block FIRE_CHARGE_BLOCK = registerBlock("fire_charge_block",
            new MagmaBlock(AbstractBlock.Settings.copy(MAGMA_BLOCK)));
    public static final Block EGG_BLOCK = registerBlock("giant_egg",
            new Block(AbstractBlock.Settings.copy(TURTLE_EGG_BLOCK)));
    public static final Block ENDER_PEARL_BLOCK = registerBlock("ender_pearl_block",
            new Block(AbstractBlock.Settings.copy(AMETHYST_BLOCK)));
    public static final Block ENDER_EYE_BLOCK = registerBlock("ender_eye_block",
            new Block(AbstractBlock.Settings.copy(AMETHYST_BLOCK)));
    public static final Block EXPERIENCE_BLOCK = registerBlock("experience_block",
            new Block(AbstractBlock.Settings.copy(AMETHYST_BLOCK)));
    public static final Block SPIDER_EYE_BLOCK = registerBlock("spider_eye_block",
            new Block(AbstractBlock.Settings.create().sounds(BlockSoundGroup.SLIME).strength(0.01f)));
    public static final Block ARMADILLO_SCUTE_BLOCK = registerBlock("armadillo_scute_block",
            new Block(AbstractBlock.Settings.create().sounds(BlockSoundGroup.CALCITE).strength(0.5f)));
    public static final Block BLAZE_ROD_BLOCK = registerBlock("blaze_rod_block",
            new PillarBlock(AbstractBlock.Settings.create().sounds(BlockSoundGroup.PACKED_MUD).strength(0.5f)));
    public static final Block BREEZE_ROD_BLOCK = registerBlock("breeze_rod_block",
            new PillarBlock(AbstractBlock.Settings.create().sounds(BlockSoundGroup.PACKED_MUD).strength(0.5f)));
    public static final Block ECHO_BLOCK = registerBlock("echo_block",
            new Block(AbstractBlock.Settings.create().sounds(BlockSoundGroup.AMETHYST_BLOCK).strength(0.7f)));
    public static final Block FLINT_BLOCK = registerBlock("flint_block",
            new Block(AbstractBlock.Settings.create().sounds(BlockSoundGroup.AMETHYST_BLOCK).strength(0.7f)));
    public static final Block GUNPOWDER_BARREL = registerBlock("gunpowder_barrel",
            new UnclutterFacingBlock(AbstractBlock.Settings.create().sounds(BlockSoundGroup.AMETHYST_BLOCK).strength(0.7f)) {
            });







    private static Block registerBlockWithoutBlockItem(String name, Block block) {
        return Registry.register(Registries.BLOCK, Identifier.of(Unclutter.MOD_ID, name), block);
    }


    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(Unclutter.MOD_ID, name), block);
    }


    private static void registerBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, Identifier.of(Unclutter.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
    }


    public static void registerBountfruitfulBlocks() {
       Unclutter.LOGGER.info("Registering Mod Blocks for " + Unclutter.MOD_ID);
    }
}
