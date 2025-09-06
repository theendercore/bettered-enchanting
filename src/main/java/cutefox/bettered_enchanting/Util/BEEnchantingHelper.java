package cutefox.bettered_enchanting.Util;

import cutefox.bettered_enchanting.data.custom.EnchantmentIngredient;
import cutefox.bettered_enchanting.init.BERegistryKeys;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.item.Item;
import net.minecraft.registry.DynamicRegistryManager;
import net.minecraft.registry.RegistryKey;

public class BEEnchantingHelper {
    public static Item getEnchantIngredient(DynamicRegistryManager registryManager, RegistryKey<Enchantment> enchantment, int enchantmentLevel) {
        var oIng = registryManager.getWrapperOrThrow(BERegistryKeys.ENCHANTMENT_INGREDIENT).getOptional(key(enchantment));
        if (oIng.isPresent()) {
            var ing = oIng.get().value();
            return ing.getItem(enchantmentLevel);
        }
        return null;
    }

    public static RegistryKey<EnchantmentIngredient> key(RegistryKey<Enchantment> id) {
        return RegistryKey.of(BERegistryKeys.ENCHANTMENT_INGREDIENT, id.getValue());
    }

}