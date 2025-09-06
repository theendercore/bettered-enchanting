package cutefox.bettered_enchanting.data;

import cutefox.bettered_enchanting.BetteredEnchanting;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;

public class ModEnchantmentTags {
    public static final TagKey<Enchantment> BENEFICIAL_TREASURE = TagKey.of(RegistryKeys.ENCHANTMENT, BetteredEnchanting.id("beneficial_treasure"));
}
