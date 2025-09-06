package cutefox.bettered_enchanting.client;

import cutefox.bettered_enchanting.Util.EnchantingIngredientMapPayload;
import cutefox.bettered_enchanting.client.init.BEHandledScreens;
import cutefox.bettered_enchanting.init.ModEnchantIngredientMap;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.networking.v1.ClientPlayNetworking;

import java.util.List;
import java.util.Map;

public class BetteredEnchantingClient implements ClientModInitializer {

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