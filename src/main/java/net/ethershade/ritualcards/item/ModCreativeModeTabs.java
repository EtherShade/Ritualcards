package net.ethershade.ritualcards.item;

import net.ethershade.ritualcards.Ritualcards;
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

    public static final RegistryObject<CreativeModeTab> RITUALCARDS_DEFAULT_TAB = CREATIVE_MODE_TABS.register("ritualcards_default_tab",
        () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.BLANK_CARD.get()))
                .title(Component.translatable("creativetab.ritualcards_default_tab"))
                .displayItems((pParameters, pOutput) -> {
                    pOutput.accept(ModItems.DEALERS_SWORD.get());
                    pOutput.accept(ModItems.DEALERS_PICKAXE.get());
                    pOutput.accept(ModItems.DEALERS_AXE.get());
                    pOutput.accept(ModItems.DEALERS_SHOVEL.get());
                    pOutput.accept(ModItems.DEALERS_HOE.get());

                    pOutput.accept(ModItems.DEALERS_HELMET.get());
                    pOutput.accept(ModItems.DEALERS_CHESTPLATE.get());
                    pOutput.accept(ModItems.DEALERS_LEGGINGS.get());
                    pOutput.accept(ModItems.DEALERS_BOOTS.get());

                    pOutput.accept(ModItems.GAMBLERS_SWORD.get());
                    pOutput.accept(ModItems.GAMBLERS_PICKAXE.get());
                    pOutput.accept(ModItems.GAMBLERS_AXE.get());
                    pOutput.accept(ModItems.GAMBLERS_SHOVEL.get());
                    pOutput.accept(ModItems.GAMBLERS_HOE.get());

                    pOutput.accept(ModItems.GAMBLERS_HELMET.get());
                    pOutput.accept(ModItems.GAMBLERS_CHESTPLATE.get());
                    pOutput.accept(ModItems.GAMBLERS_LEGGINGS.get());
                    pOutput.accept(ModItems.GAMBLERS_BOOTS.get());

                    pOutput.accept(ModItems.PLAYERS_SWORD.get());
                    pOutput.accept(ModItems.PLAYERS_PICKAXE.get());
                    pOutput.accept(ModItems.PLAYERS_AXE.get());
                    pOutput.accept(ModItems.PLAYERS_SHOVEL.get());
                    pOutput.accept(ModItems.PLAYERS_HOE.get());

                    pOutput.accept(ModItems.PLAYERS_HELMET.get());
                    pOutput.accept(ModItems.PLAYERS_CHESTPLATE.get());
                    pOutput.accept(ModItems.PLAYERS_LEGGINGS.get());
                    pOutput.accept(ModItems.PLAYERS_BOOTS.get());
                })
                .build());



    public static final RegistryObject<CreativeModeTab> RITUALCARDS_CARDS_TAB = CREATIVE_MODE_TABS.register("ritualcards_cards_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.BLANK_CARD.get()))
                    .title(Component.translatable("creativetab.ritualcards_cards_tab"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModItems.BLANK_CARD.get());
                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
