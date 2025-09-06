package cutefox.bettered_enchanting.data;

import cutefox.bettered_enchanting.BetteredEnchanting;
import net.minecraft.loot.LootTable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;

public class ModLootTables {

    public static final RegistryKey<LootTable> ESSENCE_TABLE = register("essence");
    public static final RegistryKey<LootTable> ENCHANTMENT_INGREDIENT_TABLE = register("enchantment_ingredient");
    public static final RegistryKey<LootTable> ENCHANTMENT_LOOT = register("enchantment_loot");

    private static RegistryKey<LootTable> register(String id) {
        return RegistryKey.of(RegistryKeys.LOOT_TABLE, BetteredEnchanting.id(id));
    }
}
