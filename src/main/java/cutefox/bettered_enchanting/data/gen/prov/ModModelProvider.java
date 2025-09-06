package cutefox.bettered_enchanting.data.gen.prov;

import cutefox.bettered_enchanting.BetteredEnchanting;
import cutefox.bettered_enchanting.init.BEItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;

public class ModModelProvider extends FabricModelProvider {

    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        BetteredEnchanting.LOGGER.info("Generating block model data for : " + BetteredEnchanting.MODID);

    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        BetteredEnchanting.LOGGER.info("Generating item model data for : " + BetteredEnchanting.MODID);

        //region MISC
        //itemModelGenerator.register(ModItems.STEEL_BLEND, Models.GENERATED);
        //itemModelGenerator.register(ModItems.STEEL_INGOT, Models.GENERATED);
        //endregion

        //region ENCHANTMENT INGREDIENTS
        BEItems.MOD_ITEM_LIST.stream().forEach(item -> {
            itemModelGenerator.register(item, Models.GENERATED);
        });
        //endregion

    }
}
