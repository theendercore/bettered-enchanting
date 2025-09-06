package cutefox.bettered_enchanting.data.custom;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;

import java.util.List;

public record EnchantmentIngredient(List<Item> ingredients) {
    public Item getItem(int level) {
        if (ingredients.size() > level) {
            return ingredients.get(level);
        }
        return ingredients.getLast();
    }

    public static Codec<EnchantmentIngredient> CODEC = RecordCodecBuilder.<EnchantmentIngredient>mapCodec(instance -> instance.group(
            Registries.ITEM.getCodec().listOf().fieldOf("ingredients").forGetter(EnchantmentIngredient::ingredients)
    ).apply(instance, EnchantmentIngredient::new)).codec();
}
