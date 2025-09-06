package cutefox.bettered_enchanting.client.init;

import cutefox.bettered_enchanting.BetteredEnchanting;
import cutefox.bettered_enchanting.client.screen.CustomEnchantmentScreen;
import cutefox.bettered_enchanting.init.BEScreenHandlerType;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.gui.screen.ingame.HandledScreens;

@Environment(EnvType.CLIENT)
public class BEHandledScreens {

    public static void registerModScreen() {
        BetteredEnchanting.LOGGER.info("Registering mod screens for : " + BetteredEnchanting.MODID);
        HandledScreens.register(BEScreenHandlerType.CUSTOM_ENCHANTMENT_SCREEN_HANDLER, CustomEnchantmentScreen::new);
    }

}
