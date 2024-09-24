package net.ethershade.ritualcards.item;

import net.ethershade.ritualcards.Ritualcards;
import net.ethershade.ritualcards.item.custom.FuelItem;
import net.ethershade.ritualcards.item.custom.RodOfLazinessItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, Ritualcards.MOD_ID);

    public static final RegistryObject<Item> SILVER_INGOT = ITEMS.register("silver_ingot",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> RAW_SILVER = ITEMS.register("raw_silver",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> SILVER_BERRY = ITEMS.register("silver_berry",
            () -> new Item(new Item.Properties().food(ModFoods.SILVER_BERRY)));

    public static final RegistryObject<Item> ROD_OF_LAZINESS = ITEMS.register("rod_of_laziness",
            () -> new RodOfLazinessItem(new Item.Properties().durability(100)));

    public static final RegistryObject<Item> BLANK_CARD = ITEMS.register("blank_card",
            () -> new FuelItem(new Item.Properties(), 800));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
