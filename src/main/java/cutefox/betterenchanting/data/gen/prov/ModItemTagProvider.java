package cutefox.betterenchanting.data.gen.prov;

import cutefox.betterenchanting.BetterEnchanting;
import cutefox.betterenchanting.data.ModItemTags;
import cutefox.betterenchanting.registry.BEItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.item.Items;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends FabricTagProvider.ItemTagProvider {

    public ModItemTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(output, completableFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        BetterEnchanting.LOGGER.info("Generating Item tags for : "+BetterEnchanting.MOD_ID);

        getOrCreateTagBuilder(ModItemTags.LIBRARIAN_RARE_INGREDIENT)
                .add(Items.EXPERIENCE_BOTTLE)
                .add(Items.TURTLE_SCUTE)
                .add(Items.WIND_CHARGE)
                .add(Items.HEART_OF_THE_SEA)
                .add(Items.NAUTILUS_SHELL)
                .add(Items.QUARTZ)
                .add(BEItems.MAGIC_SHARD_FULL);

        getOrCreateTagBuilder(ModItemTags.ENCHANTEMNT_INGREDIENT)
                .add(Items.EXPERIENCE_BOTTLE)
                .add(Items.PUFFERFISH)
                .add(Items.GOLDEN_CARROT)
                .add(Items.PISTON)
                .add(Items.POINTED_DRIPSTONE)
                .add(Items.PHANTOM_MEMBRANE)
                .add(Items.GLASS_BOTTLE)
                .add(BEItems.MAGIC_SHARD_FULL)
                .add(BEItems.MAGIC_SHARD_DULL)
                .add(BEItems.INFUSED_LAPIS);

        getOrCreateTagBuilder(ModItemTags.VANILLA_ESSENCE)
                .add(BEItems.ESSENCE_OF_EXPERIENCE)
                .add(BEItems.ESSENCE_OF_ARROWS)
                .add(BEItems.ESSENCE_OF_FEATHER)
                .add(BEItems.ESSENCE_OF_RESPIRATION)
                .add(BEItems.ESSENCE_OF_THORN)
                .add(BEItems.ESSENCE_OF_SEA)
                .add(BEItems.ESSENCE_OF_ICE)
                .add(BEItems.ESSENCE_OF_PROTECTION)
                .add(BEItems.ESSENCE_OF_BLAST_PROTECTION)
                .add(BEItems.ESSENCE_OF_FIRE_PROTECTION)
                .add(BEItems.ESSENCE_OF_PROJECTILE_PROTECTION)
                .add(BEItems.ESSENCE_OF_ARTHROPODS)
                .add(BEItems.ESSENCE_OF_SHARPNESS)
                .add(BEItems.ESSENCE_OF_SMITE)
                .add(BEItems.ESSENCE_OF_FIRE)
                .add(BEItems.ESSENCE_OF_KNOCKBACK)
                .add(BEItems.ESSENCE_OF_LOOTING)
                .add(BEItems.ESSENCE_OF_SWEEPING)
                .add(BEItems.ESSENCE_OF_PUNCH)
                .add(BEItems.ESSENCE_OF_POWER)
                .add(BEItems.ESSENCE_OF_SEA_LUCK)
                .add(BEItems.ESSENCE_OF_FORTUNE)
                .add(BEItems.ESSENCE_OF_EFFICIENCY)
                .add(BEItems.ESSENCE_OF_LURE)
                .add(BEItems.ESSENCE_OF_SILK_TOUCH)
                .add(BEItems.ESSENCE_OF_MENDING)
                .add(BEItems.ESSENCE_OF_UNBREAKING)
                .add(BEItems.ESSENCE_OF_CHANNELING)
                .add(BEItems.ESSENCE_OF_IMPALING)
                .add(BEItems.ESSENCE_OF_LOYALTY)
                .add(BEItems.ESSENCE_OF_RIPTIDE)
                .add(BEItems.ESSENCE_OF_MULTISHOT)
                .add(BEItems.ESSENCE_OF_PIERCING)
                .add(BEItems.ESSENCE_OF_QUICK_CHARGE)
                .add(BEItems.ESSENCE_OF_DENSITY)
                .add(BEItems.ESSENCE_OF_WIND)
                .add(BEItems.ESSENCE_OF_BREACH);

        getOrCreateTagBuilder(ModItemTags.ENCHANTMENT_ESSENCE)
                .addTag(ModItemTags.VANILLA_ESSENCE)
                .addTag(ModItemTags.BUMBLEZONE_ESSENCE)
                .addTag(ModItemTags.NEOENCHANT_ESSENCE)
                .addTag(ModItemTags.NOVA_ESSENCE)
                .addTag(ModItemTags.SPELL_POWER_ESSENCE);

        getOrCreateTagBuilder(ModItemTags.NEOENCHANT_ESSENCE)
                .add(BEItems.ESSENCE_OF_POISON)
                .add(BEItems.ESSENCE_OF_POISON_PROTECTION)
                .add(BEItems.ESSENCE_OF_MINING)
                .add(BEItems.ESSENCE_OF_SMELTING)
                .add(BEItems.ESSENCE_OF_SIGHT)
                .add(BEItems.ESSENCE_OF_LEVITATION)
                .add(BEItems.ESSENCE_OF_FORAGING)
                .add(BEItems.ESSENCE_OF_STRIKE)
                .add(BEItems.ESSENCE_OF_HEALTH)
                .add(BEItems.ESSENCE_OF_VAMPIRISM)
                .add(BEItems.ESSENCE_OF_AGILITY)
                .add(BEItems.ESSENCE_OF_COMBAT)
                .add(BEItems.ESSENCE_OF_BUILDING)
                .add(BEItems.ESSENCE_OF_FEAR)
                .add(BEItems.ESSENCE_OF_REACH)
                .add(BEItems.ESSENCE_OF_PULLING)
                .add(BEItems.ESSENCE_OF_FOOD);

        getOrCreateTagBuilder(ModItemTags.BUMBLEZONE_ESSENCE)
                .add(BEItems.ESSENCE_OF_POISON)
                .add(BEItems.ESSENCE_OF_NEUROTOXIN)
                .add(BEItems.ESSENCE_OF_COMB_CUTTER);

        getOrCreateTagBuilder(ModItemTags.SPELL_POWER_ESSENCE)
                .add(BEItems.ESSENCE_OF_MULTI_ROLL)
                .add(BEItems.ESSENCE_OF_LONGFOOT)
                .add(BEItems.ESSENCE_OF_CRITICAL_SPELL)
                .add(BEItems.ESSENCE_OF_ENERGY)
                .add(BEItems.ESSENCE_OF_HASTE)
                .add(BEItems.ESSENCE_OF_MAGIC_PROTECTION)
                .add(BEItems.ESSENCE_OF_SOULFROST)
                .add(BEItems.ESSENCE_OF_SPELL_POWER)
                .add(BEItems.ESSENCE_OF_SPELL_INFINITY)
                .add(BEItems.ESSENCE_OF_SUNFIRE);

        getOrCreateTagBuilder(ModItemTags.NOVA_ESSENCE)
                .add(BEItems.ESSENCE_OF_PHOTOSYNTHESIS)
                .add(BEItems.ESSENCE_OF_GRAVITY)
                .add(BEItems.ESSENCE_OF_WINGS);

        getOrCreateTagBuilder(ItemTags.ARMOR_ENCHANTABLE)
                .add(BEItems.ENCHANTMENT_CATALYST);

        getOrCreateTagBuilder(ItemTags.EQUIPPABLE_ENCHANTABLE)
                .add(BEItems.ENCHANTMENT_CATALYST);

        getOrCreateTagBuilder(ItemTags.WEAPON_ENCHANTABLE)
                .add(BEItems.ENCHANTMENT_CATALYST);

        getOrCreateTagBuilder(ItemTags.FIRE_ASPECT_ENCHANTABLE)
                .add(BEItems.ENCHANTMENT_CATALYST);

        getOrCreateTagBuilder(ItemTags.MACE_ENCHANTABLE)
                .add(BEItems.ENCHANTMENT_CATALYST);

        getOrCreateTagBuilder(ItemTags.SHARP_WEAPON_ENCHANTABLE)
                .add(BEItems.ENCHANTMENT_CATALYST);

        getOrCreateTagBuilder(ItemTags.SWORD_ENCHANTABLE)
                .add(BEItems.ENCHANTMENT_CATALYST);

        getOrCreateTagBuilder(ItemTags.TRIDENT_ENCHANTABLE)
                .add(BEItems.ENCHANTMENT_CATALYST);

        getOrCreateTagBuilder(ItemTags.FISHING_ENCHANTABLE)
                .add(BEItems.ENCHANTMENT_CATALYST);

        getOrCreateTagBuilder(ItemTags.DURABILITY_ENCHANTABLE)
                .add(BEItems.ENCHANTMENT_CATALYST);

        getOrCreateTagBuilder(ItemTags.CROSSBOW_ENCHANTABLE)
                .add(BEItems.ENCHANTMENT_CATALYST);

        getOrCreateTagBuilder(ItemTags.BOW_ENCHANTABLE)
                .add(BEItems.ENCHANTMENT_CATALYST);

        getOrCreateTagBuilder(ItemTags.MINING_ENCHANTABLE)
                .add(BEItems.ENCHANTMENT_CATALYST);

        getOrCreateTagBuilder(ItemTags.MINING_LOOT_ENCHANTABLE)
                .add(BEItems.ENCHANTMENT_CATALYST);

        getOrCreateTagBuilder(ModItemTags.IRON_UPGRADE_TEMPLATE)
                .setReplace(false)
                .add(BEItems.IRON_UPGRADE_SMITHING_TEMPLATE);

        getOrCreateTagBuilder(ModItemTags.DIAMOND_UPGRADE_TEMPLATE)
                .setReplace(false)
                .add(BEItems.DIAMOND_UPGRADE_SMITHING_TEMPLATE);

    }
}
