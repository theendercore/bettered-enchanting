package cutefox.bettered_enchanting.data.gen.bootstrap;

import cutefox.bettered_enchanting.Util.BEEnchantingHelper;
import cutefox.bettered_enchanting.data.custom.EnchantmentIngredient;
import cutefox.bettered_enchanting.init.BEItems;
import cutefox.bettered_enchanting.init.BERegistryKeys;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.util.Identifier;

import java.util.Arrays;
import java.util.List;


public interface ModEnchantmentIngredients {

    static void bootstrap(Registerable<EnchantmentIngredient> o) {
        create(o, Enchantments.FIRE_PROTECTION,
                Items.MAGMA_BLOCK, Items.MAGMA_CREAM, Items.LAVA_BUCKET, BEItems.ESSENCE_OF_FIRE_PROTECTION
        );
        create(o, Enchantments.KNOCKBACK, Items.PISTON, BEItems.ESSENCE_OF_KNOCKBACK);
        create(o, Enchantments.MENDING, BEItems.ESSENCE_OF_MENDING);
        create(o, Enchantments.POWER,
                Items.SNOWBALL, Items.LEATHER, Items.GHAST_TEAR, Items.CROSSBOW, BEItems.ESSENCE_OF_POWER
        );
        create(o, Enchantments.LUCK_OF_THE_SEA,
                Items.NAUTILUS_SHELL, Items.HEART_OF_THE_SEA, BEItems.ESSENCE_OF_SEA_LUCK
        );
        create(o, Enchantments.THORNS, Items.CACTUS, Items.PUFFERFISH_BUCKET, BEItems.ESSENCE_OF_THORN);
        create(o, Enchantments.FEATHER_FALLING,
                Items.FEATHER, Items.PHANTOM_MEMBRANE, Items.WIND_CHARGE, BEItems.ESSENCE_OF_FEATHER
        );
        create(o, Enchantments.FLAME, BEItems.ESSENCE_OF_FIRE);
        create(o, Enchantments.AQUA_AFFINITY, BEItems.ESSENCE_OF_SEA);
        create(o, Enchantments.SWEEPING_EDGE, Items.IRON_BARS, Items.OBSIDIAN, BEItems.ESSENCE_OF_SWEEPING);
        create(o, Enchantments.PROJECTILE_PROTECTION,
                Items.LEATHER, Items.BRICK, Items.IRON_BARS, BEItems.ESSENCE_OF_PROJECTILE_PROTECTION
        );
        create(o, Enchantments.WIND_BURST, Items.SUGAR_CANE, Items.WIND_CHARGE, BEItems.ESSENCE_OF_WIND);
        create(o, Enchantments.SMITE,
                Items.ROTTEN_FLESH, Items.GLOWSTONE, Items.QUARTZ, Items.AMETHYST_SHARD, BEItems.ESSENCE_OF_SMITE
        );
        create(o, Enchantments.FROST_WALKER, Items.BLUE_ICE, BEItems.ESSENCE_OF_ICE);
        create(o, Enchantments.PUNCH, Items.DEEPSLATE, BEItems.ESSENCE_OF_PUNCH);
        create(o, Enchantments.BLAST_PROTECTION,
                Items.GUNPOWDER, Items.TNT, Items.CREEPER_HEAD, BEItems.ESSENCE_OF_BLAST_PROTECTION
        );
        create(o, Enchantments.IMPALING,
                Items.POINTED_DRIPSTONE, Items.IRON_BARS, Items.QUARTZ, Items.DIAMOND_SWORD, BEItems.ESSENCE_OF_IMPALING
        );
        create(o, Enchantments.BANE_OF_ARTHROPODS,
                Items.SHEARS, Items.SPIDER_EYE, Items.COBWEB, Items.FERMENTED_SPIDER_EYE, BEItems.ESSENCE_OF_ARTHROPODS
        );
        create(o, Enchantments.SHARPNESS,
                Items.FLINT, Items.IRON_SWORD, Items.GRINDSTONE, Items.DIAMOND, BEItems.ESSENCE_OF_SHARPNESS
        );
        create(o, Enchantments.EFFICIENCY,
                Items.FLINT, Items.GOLDEN_APPLE, Items.OBSIDIAN, Items.CRYING_OBSIDIAN, BEItems.ESSENCE_OF_EFFICIENCY
        );
        create(o, Enchantments.BREACH, Items.IRON_INGOT, Items.SMOOTH_STONE, Items.TNT, BEItems.ESSENCE_OF_BREACH);
        create(o, Enchantments.SILK_TOUCH, BEItems.ESSENCE_OF_SILK_TOUCH);
        create(o, Enchantments.LOOTING, Items.EMERALD, Items.SPORE_BLOSSOM, BEItems.ESSENCE_OF_LOOTING);
        create(o, Enchantments.LURE, Items.CARROT_ON_A_STICK, Items.BREAD, BEItems.ESSENCE_OF_LURE);
        create(o, Enchantments.DEPTH_STRIDER, Items.COD, Items.SPONGE, BEItems.ESSENCE_OF_SEA);
        create(o, Enchantments.SOUL_SPEED, BEItems.SOUL_ESSENCE);
        create(o, Enchantments.RESPIRATION, Items.PUFFERFISH, Items.TURTLE_SCUTE, BEItems.ESSENCE_OF_RESPIRATION);
        create(o, Enchantments.FIRE_ASPECT, Items.FIRE_CHARGE, BEItems.ESSENCE_OF_FIRE);
        create(o, Enchantments.PIERCING,
                Items.FLINT, Items.ARROW, Items.SPECTRAL_ARROW, BEItems.ESSENCE_OF_PIERCING
        );
        create(o, Enchantments.DENSITY,
                Items.STONE, Items.DEEPSLATE, Items.OBSIDIAN, Items.LODESTONE, BEItems.ESSENCE_OF_DENSITY
        );
        create(o, Enchantments.SWIFT_SNEAK,
                BEItems.ESSENCE_OF_SNEAK
        );
        create(o, Enchantments.LOYALTY, Items.BONE_BLOCK, Items.GOLDEN_CARROT, BEItems.ESSENCE_OF_LOYALTY);
        create(o, Enchantments.UNBREAKING, Items.DIAMOND, Items.CRYING_OBSIDIAN, BEItems.ESSENCE_OF_UNBREAKING);
        create(o, Enchantments.RIPTIDE, Items.WATER_BUCKET, Items.NAUTILUS_SHELL, BEItems.ESSENCE_OF_RIPTIDE);
        create(o, Enchantments.QUICK_CHARGE,
                Items.AMETHYST_SHARD, Items.GLOWSTONE, BEItems.ESSENCE_OF_QUICK_CHARGE
        );
        create(o, Enchantments.PROTECTION,
                Items.COPPER_INGOT, Items.IRON_INGOT, Items.DIAMOND, BEItems.ESSENCE_OF_PROTECTION
        );

        create(o, Enchantments.INFINITY, BEItems.ESSENCE_OF_ARROWS);
        create(o, Enchantments.FORTUNE, Items.GOLD_BLOCK, Items.EMERALD_BLOCK, BEItems.ESSENCE_OF_FORTUNE);
        create(o, Enchantments.MULTISHOT, BEItems.ESSENCE_OF_MULTISHOT);
        create(o, Enchantments.CHANNELING, BEItems.ESSENCE_OF_CHANNELING);

        o.register(key(Identifier.of("farmersdelight:backstabbing")), new EnchantmentIngredient(List.of(Items.FLINT, Items.BONE, Items.SADDLE)));
    }

    static void create(Registerable<EnchantmentIngredient> o, RegistryKey<Enchantment> ench, Item... ing) {
        o.register(BEEnchantingHelper.key(ench),
                new EnchantmentIngredient(
                        Arrays.stream(ing).toList()
                )
        );
    }

    static RegistryKey<EnchantmentIngredient> key(Identifier id) {
        return RegistryKey.of(BERegistryKeys.ENCHANTMENT_INGREDIENT, id);
    }
}
