package cutefox.bettered_enchanting.conditions;

import com.mojang.serialization.MapCodec;
import cutefox.bettered_enchanting.BetteredEnchanting;
import net.fabricmc.fabric.api.resource.conditions.v1.ResourceCondition;
import net.fabricmc.fabric.api.resource.conditions.v1.ResourceConditionType;
import net.minecraft.registry.RegistryWrapper;
import org.jetbrains.annotations.Nullable;

public class BumblezoneCompatCondition implements ResourceCondition {
    public static final MapCodec<BumblezoneCompatCondition> CODEC = MapCodec.unit(BumblezoneCompatCondition::new);

    @Override
    public ResourceConditionType<?> getType() {
        return ModConfigConditions.BUMBLEZONE;
    }


    @Override
    public boolean test(@Nullable RegistryWrapper.WrapperLookup registryLookup) {
        return BetteredEnchanting.BUMBLEZONE_PRESENT;
    }
}