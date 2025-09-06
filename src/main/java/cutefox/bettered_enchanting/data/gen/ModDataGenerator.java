package cutefox.bettered_enchanting.data.gen;

import cutefox.bettered_enchanting.data.gen.prov.ModItemTagProvider;
import cutefox.bettered_enchanting.data.gen.prov.ModLootTableProvider;
import cutefox.bettered_enchanting.data.gen.prov.ModModelProvider;
import cutefox.bettered_enchanting.data.gen.prov.ModRecipeProvider;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;

public class ModDataGenerator implements DataGeneratorEntrypoint {

    @Override
    public void onInitializeDataGenerator(FabricDataGenerator generator) {
        FabricDataGenerator.Pack pack = generator.createPack();

        // Adding a provider example:
        //
        // pack.addProvider(AdvancementsProvider::new);
        pack.addProvider(ModModelProvider::new);
        pack.addProvider(ModRecipeProvider::new);
        pack.addProvider(ModItemTagProvider::new);
        pack.addProvider(ModLootTableProvider::new);
    }

}
