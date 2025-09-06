package cutefox.bettered_enchanting.Util;

import cutefox.bettered_enchanting.init.ModEnchantIngredientMap;
import net.minecraft.network.RegistryByteBuf;
import net.minecraft.network.codec.PacketCodec;
import net.minecraft.network.packet.CustomPayload;

import java.util.List;
import java.util.Map;

public record EnchantingIngredientMapPayload(Map<String, List<String>> map) implements CustomPayload {
    public static final Id<EnchantingIngredientMapPayload> ID = new Id<>(
            BetteredEnchantingConstants.ENCHANT_INGREDIENT_MAP_PACKET_ID);
    public static final PacketCodec<RegistryByteBuf, EnchantingIngredientMapPayload> CODEC = PacketCodec.tuple(
            ModEnchantIngredientMap.MAP_CODEC, EnchantingIngredientMapPayload::map,
            EnchantingIngredientMapPayload::new);

    @Override
    public Id<? extends CustomPayload> getId() {
        return ID;
    }
}