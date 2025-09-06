package cutefox.betterenchanting.Util;

import net.minecraft.registry.DynamicRegistryManager;

public class Utils {
    private static DynamicRegistryManager registryManager;

    public static DynamicRegistryManager getRegistryManager() {
        return registryManager;
    }

    public static void setRegistryManager(DynamicRegistryManager registryManager) {
        Utils.registryManager = registryManager;
    }
}
