package cutefox.betterenchanting.client.init;

import cutefox.betterenchanting.BetterEnchanting;
import cutefox.betterenchanting.client.screen.CustomEnchantmentScreen;
import cutefox.betterenchanting.init.BEScreenHandlerType;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.gui.screen.ingame.HandledScreens;

@Environment(EnvType.CLIENT)
public class BEHandledScreens {

    public static void registerModScreen() {
        BetterEnchanting.LOGGER.info("Registering mod screens for : " + BetterEnchanting.MODID);
        HandledScreens.register(BEScreenHandlerType.CUSTOM_ENCHANTMENT_SCREEN_HANDLER, CustomEnchantmentScreen::new);
    }

}
