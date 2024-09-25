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

                    pOutput.accept(ModBlocks.STYGIAN_ROCK.get());
                    pOutput.accept(ModBlocks.COBBLED_STYGIAN_ROCK.get());

                    pOutput.accept(ModBlocks.COBBLED_STYGIAN_ROCK_STAIRS.get());
                    pOutput.accept(ModBlocks.COBBLED_STYGIAN_ROCK_SLAB.get());
                    pOutput.accept(ModBlocks.COBBLED_STYGIAN_ROCK_BUTTON.get());
                    pOutput.accept(ModBlocks.COBBLED_STYGIAN_ROCK_PRESSURE_PLATE.get());

                    pOutput.accept(ModBlocks.COBBLED_STYGIAN_ROCK_FENCE.get());
                    pOutput.accept(ModBlocks.COBBLED_STYGIAN_ROCK_FENCE_GATE.get());
                    pOutput.accept(ModBlocks.COBBLED_STYGIAN_ROCK_WALL.get());

                    pOutput.accept(ModBlocks.COBBLED_STYGIAN_ROCK_DOOR.get());
                    pOutput.accept(ModBlocks.COBBLED_STYGIAN_ROCK_TRAPDOOR.get());

                    pOutput.accept(ModBlocks.SILVER_BLOCK.get());
                    pOutput.accept(ModBlocks.RAW_SILVER_BLOCK.get());
                    pOutput.accept(ModBlocks.SILVER_ORE.get());
                    pOutput.accept(ModBlocks.DEEPSLATE_SILVER_ORE.get());
                    pOutput.accept(ModBlocks.END_SILVER_ORE.get());

                    pOutput.accept(ModBlocks.SILVER_BELL.get());
                })
                .build());

    public static final RegistryObject<CreativeModeTab> RITUALCARDS_EQUIPMENT_TAB = CREATIVE_MODE_TABS.register("ritualcards_equipment_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.ROD_OF_LAZINESS.get()))
                    .title(Component.translatable("creativetab.ritualcards_equipment_tab"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModItems.ROD_OF_LAZINESS.get());
                        pOutput.accept(ModItems.SILVER_BERRY.get());
                        pOutput.accept(ModItems.SILVER_SWORD.get());
                        pOutput.accept(ModItems.SILVER_PICKAXE.get());
                        pOutput.accept(ModItems.SILVER_AXE.get());
                        pOutput.accept(ModItems.SILVER_SHOVEL.get());
                        pOutput.accept(ModItems.SILVER_HOE.get());
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
