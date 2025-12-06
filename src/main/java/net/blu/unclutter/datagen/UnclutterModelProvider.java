package net.blu.unclutter.datagen;

import net.blu.unclutter.UnclutterBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;

public class UnclutterModelProvider extends FabricModelProvider {
    public UnclutterModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerSimpleCubeAll(UnclutterBlocks.LEATHER_BLOCK);
        blockStateModelGenerator.registerNetherrackBottomCustomTop(UnclutterBlocks.GUNPOWDER_BARREL);

    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {

    }
}
