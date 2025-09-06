package cutefox.betterenchanting.data;

import cutefox.betterenchanting.BetterEnchanting;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;

public class ModEnchantmentTags {
    public static final TagKey<Enchantment> BENEFICIAL_TREASURE = TagKey.of(RegistryKeys.ENCHANTMENT, BetterEnchanting.id("beneficial_treasure"));
}
