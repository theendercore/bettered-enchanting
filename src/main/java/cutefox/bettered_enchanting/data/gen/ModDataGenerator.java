package cutefox.bettered_enchanting.data.gen;

import cutefox.bettered_enchanting.data.custom.EnchantmentIngredient;
import cutefox.bettered_enchanting.data.gen.bootstrap.ModEnchantmentIngredients;
import cutefox.bettered_enchanting.data.gen.prov.ModItemTagProvider;
import cutefox.bettered_enchanting.data.gen.prov.ModLootTableProvider;
import cutefox.bettered_enchanting.data.gen.prov.ModModelProvider;
import cutefox.bettered_enchanting.data.gen.prov.ModRecipeProvider;
import cutefox.bettered_enchanting.init.BERegistryKeys;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricDynamicRegistryProvider;
import net.minecraft.registry.RegistryBuilder;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryWrapper;

import static cutefox.bettered_enchanting.BetteredEnchanting.MODID;

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
        pack.addProvider((o, r) -> new FabricDynamicRegistryProvider(o, r) {
            @Override
            public String getName() {
                return MODID;
            }

            @Override
            protected void configure(RegistryWrapper.WrapperLookup reg, Entries e) {
                var lookup = reg.getWrapperOrThrow(BERegistryKeys.ENCHANTMENT_INGREDIENT);
                for (RegistryKey<EnchantmentIngredient> key : lookup.streamKeys().toList()) {
                    e.add(lookup, key);
                }
            }
        });
    }

    @Override
    public void buildRegistry(RegistryBuilder gen) {
        gen.addRegistry(BERegistryKeys.ENCHANTMENT_INGREDIENT, ModEnchantmentIngredients::bootstrap);
    }
}
