package cutefox.betterenchanting.client;

import cutefox.betterenchanting.Util.EnchantingIngredientMapPayload;
import cutefox.betterenchanting.client.init.BEHandledScreens;
import cutefox.betterenchanting.init.ModEnchantIngredientMap;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.networking.v1.ClientPlayNetworking;

import java.util.List;
import java.util.Map;

public class BetterEnchantingClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        BEHandledScreens.registerModScreen();
        ClientPlayNetworking.registerGlobalReceiver(EnchantingIngredientMapPayload.ID, (payload, context) -> {
            context.client().execute(() -> {
                Map<String, List<String>> decodedMap = payload.map();
                ModEnchantIngredientMap.genMapFromJsonStringMap(context.client().world, decodedMap);
            });
        });
    }
}