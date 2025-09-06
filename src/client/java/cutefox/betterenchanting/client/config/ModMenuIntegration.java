package cutefox.betterenchanting.client.config;

import com.terraformersmc.modmenu.api.ConfigScreenFactory;
import com.terraformersmc.modmenu.api.ModMenuApi;
import cutefox.betterenchanting.config.GlobalConfig;

public class ModMenuIntegration implements ModMenuApi {

    /*@Override
    public Map<String, ConfigScreenFactory<?>> getProvidedConfigScreenFactories() {
        return parent -> MidnightConfig.getScreen(parent, "better-enchanting/betterEnchanting");
    }*/

    @Override
    public ConfigScreenFactory<?> getModConfigScreenFactory() {
        return parent -> GlobalConfig.getScreen(parent, "better-enchanting/betterEnchanting");
    }
}
