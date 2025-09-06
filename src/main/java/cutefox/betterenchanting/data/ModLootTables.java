package cutefox.betterenchanting.data;

import cutefox.betterenchanting.BetterEnchanting;
import net.minecraft.loot.LootTable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;

public class ModLootTables {

    public static final RegistryKey<LootTable> ESSENCE_TABLE = register("essence");
    public static final RegistryKey<LootTable> ENCHANTMENT_INGREDIENT_TABLE = register("enchantment_ingredient");
    public static final RegistryKey<LootTable> ENCHANTMENT_LOOT = register("enchantment_loot");

    private static RegistryKey<LootTable> register(String id) {
        return RegistryKey.of(RegistryKeys.LOOT_TABLE, BetterEnchanting.id(id));
    }
}
