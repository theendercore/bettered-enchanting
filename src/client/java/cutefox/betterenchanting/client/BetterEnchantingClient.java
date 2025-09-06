package cutefox.betterenchanting.client;

import java.util.*;

import cutefox.betterenchanting.Util.EnchantingIngredientMapPayload;
import cutefox.betterenchanting.registry.ModEnchantIngredientMap;
import cutefox.betterenchanting.client.registry.BEHandledScreens;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.networking.v1.ClientPlayNetworking;

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