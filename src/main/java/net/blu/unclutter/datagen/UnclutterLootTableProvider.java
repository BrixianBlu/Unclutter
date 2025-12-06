package net.blu.unclutter.datagen;

import net.blu.unclutter.UnclutterBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class UnclutterLootTableProvider extends FabricBlockLootTableProvider {
    public UnclutterLootTableProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, registryLookup);
    }

    @Override
    public void generate() {
        addDrop(UnclutterBlocks.LEATHER_BLOCK);

    }
}
