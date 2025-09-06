package cutefox.betterenchanting.registry;

import cutefox.betterenchanting.BetterEnchanting;
import cutefox.betterenchanting.Util.Utils;
import cutefox.betterenchanting.item.ItemWithRemainderChance;
import net.minecraft.component.DataComponentTypes;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;

import java.util.ArrayList;
import java.util.List;

public class BEItems {

    public static void registerModItems() {
        BetterEnchanting.LOGGER.info("Registering mod iems for : " + BetterEnchanting.MOD_ID);
    }


    //region ENCHANTMENT INGREDIENTS
    public static final List<Item> MOD_ITEM_LIST = new ArrayList<>();
    public static final List<Item> MOD_ITEM_LIST_BUMBLEZONE_COMPAT = new ArrayList<>();
    public static final Item INFUSED_LAPIS = registerItem("infused_lapis", new Item(new Item.Settings()));
    public static final Item MAGIC_SHARD_DULL = registerItem("magic_shard_dull", new Item(new Item.Settings()));
    public static final Item MAGIC_SHARD_FULL = registerItem("magic_shard_full", new ItemWithRemainderChance(new Item.Settings().maxCount(16).component(DataComponentTypes.ENCHANTMENT_GLINT_OVERRIDE, true).recipeRemainder(BEItems.MAGIC_SHARD_DULL)));
    //endregion

    //region UPGRADE TEMPLATES
    public static final Item IRON_UPGRADE_SMITHING_TEMPLATE = registerItem("iron_upgrade_smithing_template", new Item(new Item.Settings()));
    public static final Item DIAMOND_UPGRADE_SMITHING_TEMPLATE = registerItem("diamond_upgrade_smithing_template", new Item(new Item.Settings()));
    public static final Item ENCHANTMENT_CATALYST = registerItem("enchantment_catalyst", new Item(new Item.Settings().maxCount(16)));
    //endregion

    //Armors
    public static final Item ESSENCE_OF_PROTECTION = registerItem("essence_of_protection", essence());
    public static final Item ESSENCE_OF_FIRE_PROTECTION = registerItem("essence_of_fire_protection", essence());
    public static final Item ESSENCE_OF_BLAST_PROTECTION = registerItem("essence_of_blast_protection", essence());
    public static final Item ESSENCE_OF_PROJECTILE_PROTECTION = registerItem("essence_of_projectile_protection", essence());
    public static final Item SOUL_ESSENCE_1 = registerItem("soul_essence_1", essence());
    public static final Item SOUL_ESSENCE_2 = registerItem("soul_essence_2", new Item(new Item.Settings().maxCount(1).fireproof().component(DataComponentTypes.ENCHANTMENT_GLINT_OVERRIDE, true).recipeRemainder(BEItems.SOUL_ESSENCE_1)));
    public static final Item SOUL_ESSENCE_3 = registerItem("soul_essence_3", new Item(new Item.Settings().maxCount(1).fireproof().component(DataComponentTypes.ENCHANTMENT_GLINT_OVERRIDE, true).recipeRemainder(BEItems.SOUL_ESSENCE_2)));
    public static final Item ESSENCE_OF_SNEAK_1 = registerItem("essence_of_sneak_1", essence());
    public static final Item ESSENCE_OF_SNEAK_2 = registerItem("essence_of_sneak_2", new Item(new Item.Settings().maxCount(1).fireproof().component(DataComponentTypes.ENCHANTMENT_GLINT_OVERRIDE, true).recipeRemainder(BEItems.ESSENCE_OF_SNEAK_1)));
    public static final Item ESSENCE_OF_SNEAK_3 = registerItem("essence_of_sneak_3", new Item(new Item.Settings().maxCount(1).fireproof().component(DataComponentTypes.ENCHANTMENT_GLINT_OVERRIDE, true).recipeRemainder(BEItems.ESSENCE_OF_SNEAK_2)));
    public static final Item ESSENCE_OF_FEATHER = registerItem("essence_of_feather", essence());
    public static final Item ESSENCE_OF_RESPIRATION = registerItem("essence_of_respiration", essence());
    public static final Item ESSENCE_OF_SEA = registerItem("essence_of_sea", essence());
    public static final Item ESSENCE_OF_THORN = registerItem("essence_of_thorn", essence());
    public static final Item ESSENCE_OF_ICE = registerItem("essence_of_ice", essence());

    //Swords
    public static final Item ESSENCE_OF_SWEEPING = registerItem("essence_of_sweeping", essence());
    public static final Item ESSENCE_OF_SHARPNESS = registerItem("essence_of_sharpness", essence());
    public static final Item ESSENCE_OF_SMITE = registerItem("essence_of_smite", essence());
    public static final Item ESSENCE_OF_ARTHROPODS = registerItem("essence_of_arthropods", essence());
    public static final Item ESSENCE_OF_KNOCKBACK = registerItem("essence_of_knockback", essence());
    public static final Item ESSENCE_OF_FIRE = registerItem("essence_of_fire", essence());
    public static final Item ESSENCE_OF_LOOTING = registerItem("essence_of_looting", essence());

    //Bows
    public static final Item ESSENCE_OF_ARROWS = registerItem("essence_of_arrows", essence());
    public static final Item ESSENCE_OF_POWER = registerItem("essence_of_power", essence());
    public static final Item ESSENCE_OF_PUNCH = registerItem("essence_of_punch", essence());

    //Tools
    public static final Item ESSENCE_OF_EFFICIENCY = registerItem("essence_of_efficiency", essence());
    public static final Item ESSENCE_OF_SILK_TOUCH = registerItem("essence_of_silk_touch", essence());
    public static final Item ESSENCE_OF_FORTUNE = registerItem("essence_of_fortune", essence());

    //Fishing tool
    public static final Item ESSENCE_OF_SEA_LUCK = registerItem("essence_of_sea_luck", essence());
    public static final Item ESSENCE_OF_LURE = registerItem("essence_of_lure", essence());

    //Anything
    public static final Item ESSENCE_OF_EXPERIENCE = registerItem("essence_of_experience", essence());
    public static final Item ESSENCE_OF_MENDING = registerItem("essence_of_mending", essence());
    public static final Item ESSENCE_OF_UNBREAKING = registerItem("essence_of_unbreaking", essence());

    //Trident
    public static final Item ESSENCE_OF_CHANNELING = registerItem("essence_of_channeling", essence());
    public static final Item ESSENCE_OF_IMPALING = registerItem("essence_of_impaling", essence());
    public static final Item ESSENCE_OF_LOYALTY = registerItem("essence_of_loyalty", essence());
    public static final Item ESSENCE_OF_RIPTIDE = registerItem("essence_of_riptide", essence());

    //Crossbow
    public static final Item ESSENCE_OF_MULTISHOT = registerItem("essence_of_multishot", essence());
    public static final Item ESSENCE_OF_PIERCING = registerItem("essence_of_piercing", essence());
    public static final Item ESSENCE_OF_QUICK_CHARGE = registerItem("essence_of_quick_charge", essence());

    //Mace
    public static final Item ESSENCE_OF_DENSITY = registerItem("essence_of_density", essence());
    public static final Item ESSENCE_OF_BREACH = registerItem("essence_of_breach", essence());
    public static final Item ESSENCE_OF_WIND = registerItem("essence_of_wind", essence());


    //region MODDED
    //Neo Enchant Plus
    public static final Item ESSENCE_OF_POISON = registerItem("essence_of_poison", essence());
    public static final Item ESSENCE_OF_POISON_PROTECTION = registerItem("essence_of_poison_protection", essence());
    public static final Item ESSENCE_OF_MINING = registerItem("essence_of_mining", essence());
    public static final Item ESSENCE_OF_SMELTING = registerItem("essence_of_smelting", essence());
    public static final Item ESSENCE_OF_SIGHT = registerItem("essence_of_sight", essence());
    public static final Item ESSENCE_OF_LEVITATION = registerItem("essence_of_levitation", essence());
    public static final Item ESSENCE_OF_FORAGING = registerItem("essence_of_foraging", essence());
    public static final Item ESSENCE_OF_STRIKE = registerItem("essence_of_strike", essence());
    public static final Item ESSENCE_OF_HEALTH = registerItem("essence_of_health", essence());
    public static final Item ESSENCE_OF_VAMPIRISM = registerItem("essence_of_vampirism", essence());
    public static final Item ESSENCE_OF_AGILITY = registerItem("essence_of_agility", essence());
    public static final Item ESSENCE_OF_COMBAT = registerItem("essence_of_combat", essence());
    public static final Item ESSENCE_OF_BUILDING = registerItem("essence_of_building", essence());
    public static final Item ESSENCE_OF_FEAR = registerItem("essence_of_fear", essence());
    public static final Item ESSENCE_OF_REACH = registerItem("essence_of_reach", essence());
    public static final Item ESSENCE_OF_PULLING = registerItem("essence_of_pulling", essence());
    public static final Item ESSENCE_OF_FOOD = registerItem("essence_of_food", essence());

    //The Bumblezone
    public static final Item ESSENCE_OF_NEUROTOXIN = registerItemBulblezoneCompat("essence_of_neurotoxin", essence());
    public static final Item ESSENCE_OF_COMB_CUTTER = registerItemBulblezoneCompat("essence_of_comb_cutter", essence());

    //Dungeons and Taverns
    public static final Item ESSENCE_OF_PHOTOSYNTHESIS = registerItem("essence_of_photosynthesis", essence());
    public static final Item ESSENCE_OF_GRAVITY = registerItem("essence_of_gravity", essence());
    public static final Item ESSENCE_OF_WINGS = registerItem("essence_of_wings", essence());

    //Diversity
    public static final Item ESSENCE_OF_CAPACITY = registerItem("essence_of_capacity", essence());
    public static final Item ESSENCE_OF_REFILL = registerItem("essence_of_refill", essence());

    //Toss Up
    public static final Item ESSENCE_OF_EXPLOSION = registerItem("essence_of_explosion", essence());

    //Spell engine
    public static final Item ESSENCE_OF_MULTI_ROLL = registerItem("essence_of_multi_roll", essence());
    public static final Item ESSENCE_OF_LONGFOOT = registerItem("essence_of_longfoot", essence());

    public static final Item ESSENCE_OF_CRITICAL_SPELL = registerItem("essence_of_critical_spell", essence());
    public static final Item ESSENCE_OF_ENERGY = registerItem("essence_of_energy", essence());
    public static final Item ESSENCE_OF_HASTE = registerItem("essence_of_haste", essence());
    public static final Item ESSENCE_OF_MAGIC_PROTECTION = registerItem("essence_of_magic_protection", essence());
    public static final Item ESSENCE_OF_SOULFROST = registerItem("essence_of_soulfrost", essence());
    public static final Item ESSENCE_OF_SPELL_POWER = registerItem("essence_of_spell_power", essence());
    public static final Item ESSENCE_OF_SUNFIRE = registerItem("essence_of_sunfire", essence());
    public static final Item ESSENCE_OF_SPELL_INFINITY = registerItem("essence_of_spell_infinity", essence());


    //endregion

    private static Item registerItem(String id, Item item) {
        Item i = Registry.register(Registries.ITEM, Utils.id(id), item);
        MOD_ITEM_LIST.add(i);
        return i;
    }

    private static Item registerItemBulblezoneCompat(String id, Item item) {
        Item i = Registry.register(Registries.ITEM, Utils.id(id), item);
        MOD_ITEM_LIST_BUMBLEZONE_COMPAT.add(i);
        return i;
    }

    public static Item essence() {
        return new Item(new Item.Settings().maxCount(1).fireproof().component(DataComponentTypes.ENCHANTMENT_GLINT_OVERRIDE, true));
    }

}