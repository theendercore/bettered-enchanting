package cutefox.bettered_enchanting.client.config;

import com.terraformersmc.modmenu.api.ConfigScreenFactory;
import com.terraformersmc.modmenu.api.ModMenuApi;
import cutefox.bettered_enchanting.config.GlobalConfig;

public class ModMenuIntegration implements ModMenuApi {

    /*@Override
    public Map<String, ConfigScreenFactory<?>> getProvidedConfigScreenFactories() {
        return parent -> MidnightConfig.getScreen(parent, "bettered_enchanting/bettered_enchanting");
    }*/

    @Override
    public ConfigScreenFactory<?> getModConfigScreenFactory() {
        return parent -> GlobalConfig.getScreen(parent, "bettered_enchanting/bettered_enchanting");
    }
}
