package net.ethershade.ritualcards.item;

import net.ethershade.ritualcards.Ritualcards;
import net.ethershade.ritualcards.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Ritualcards.MOD_ID);

public static final RegistryObject<CreativeModeTab> RITUALCARDS_RESOURCES_TAB = CREATIVE_MODE_TABS.register("ritualcards_resources_tab",
        () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.SILVER_INGOT.get()))
                .title(Component.translatable("creativetab.ritualcards_resources_tab"))
                .displayItems((pParameters, pOutput) -> {
                    pOutput.accept(ModItems.SILVER_INGOT.get());
                    pOutput.accept(ModItems.RAW_SILVER.get());

                    pOutput.accept(ModBlocks.SILVER_BLOCK.get());
                })
                .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
