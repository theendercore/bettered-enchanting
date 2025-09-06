package cutefox.betterenchanting.init;

import cutefox.betterenchanting.BetterEnchanting;
import net.fabricmc.fabric.api.loot.v3.LootTableEvents;
import net.minecraft.loot.LootTables;
import net.minecraft.loot.entry.ItemEntry;


public class BELootTableModifiers {

    public static void modifyLootTables() {
        BetterEnchanting.LOGGER.info("Modifying loot tables for : " + BetterEnchanting.MOD_ID);

        LootTableEvents.MODIFY.register((key, builder, source, registries) -> {
            if (source.isBuiltin() && LootTables.PIGLIN_BARTERING_GAMEPLAY == key) {

                builder.modifyPools(p -> {
                    p.with(ItemEntry.builder(BEItems.SOUL_ESSENCE).weight(15));
                });
            }
        });

        LootTableEvents.MODIFY.register((key, builder, source, registries) -> {
            if (source.isBuiltin() && LootTables.FISHING_TREASURE_GAMEPLAY == key) {

                builder.modifyPools(p -> {
                    //p.with(LootTableEntry.builder(ModLootTables.ESSENCE_TABLE));
                });
            }
        });

    }


}
