package cutefox.bettered_enchanting.init;

import cutefox.bettered_enchanting.data.custom.EnchantmentIngredient;
import net.fabricmc.fabric.api.event.registry.DynamicRegistries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;

import static cutefox.bettered_enchanting.BetteredEnchanting.id;

public interface BERegistryKeys {
    RegistryKey<Registry<EnchantmentIngredient>> ENCHANTMENT_INGREDIENT = RegistryKey.ofRegistry(id("enchantment_ingredient"));

    static void init() {
        DynamicRegistries.registerSynced(ENCHANTMENT_INGREDIENT, EnchantmentIngredient.CODEC);
    }
}
