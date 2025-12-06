package net.blu.unclutter;

import net.blu.unclutter.datagen.UnclutterBlockTagProvider;
import net.blu.unclutter.datagen.UnclutterLootTableProvider;
import net.blu.unclutter.datagen.UnclutterModelProvider;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;

public class UnclutterDataGenerator implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
		FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();

		pack.addProvider(UnclutterModelProvider::new);
		pack.addProvider(UnclutterLootTableProvider::new);
		pack.addProvider(UnclutterBlockTagProvider::new);

	}
}
