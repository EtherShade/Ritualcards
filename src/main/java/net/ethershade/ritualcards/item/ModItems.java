package net.ethershade.ritualcards.item;

import net.ethershade.ritualcards.Ritualcards;
import net.ethershade.ritualcards.item.custom.FuelItem;
import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, Ritualcards.MOD_ID);

    public static final RegistryObject<Item> BLANK_CARD = ITEMS.register("blank_card",
            () -> new FuelItem(new Item.Properties(), 800));


    public static final RegistryObject<Item> DEALERS_SWORD = ITEMS.register("dealers_sword",
            () -> new SwordItem(ModToolTiers.DEALER, 4, 2, new Item.Properties()));
    public static final RegistryObject<Item> DEALERS_PICKAXE = ITEMS.register("dealers_pickaxe",
            () -> new PickaxeItem(ModToolTiers.DEALER, 1, 1, new Item.Properties()));
    public static final RegistryObject<Item> DEALERS_AXE = ITEMS.register("dealers_axe",
            () -> new AxeItem(ModToolTiers.DEALER, 7, 1, new Item.Properties()));
    public static final RegistryObject<Item> DEALERS_SHOVEL = ITEMS.register("dealers_shovel",
            () -> new ShovelItem(ModToolTiers.DEALER, 0, 0, new Item.Properties()));
    public static final RegistryObject<Item> DEALERS_HOE = ITEMS.register("dealers_hoe",
            () -> new HoeItem(ModToolTiers.DEALER, 0, 0, new Item.Properties()));

    public static final RegistryObject<Item> DEALERS_HELMET = ITEMS.register("dealers_helmet",
            () -> new ArmorItem(ModArmorMaterials.DEALER, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> DEALERS_CHESTPLATE = ITEMS.register("dealers_chestplate",
            () -> new ArmorItem(ModArmorMaterials.DEALER, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final RegistryObject<Item> DEALERS_LEGGINGS = ITEMS.register("dealers_leggings",
            () -> new ArmorItem(ModArmorMaterials.DEALER, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final RegistryObject<Item> DEALERS_BOOTS = ITEMS.register("dealers_boots",
            () -> new ArmorItem(ModArmorMaterials.DEALER, ArmorItem.Type.BOOTS, new Item.Properties()));

    public static final RegistryObject<Item> GAMBLERS_SWORD = ITEMS.register("gamblers_sword",
            () -> new SwordItem(ModToolTiers.DEALER, 4, 2, new Item.Properties()));
    public static final RegistryObject<Item> GAMBLERS_PICKAXE = ITEMS.register("gamblers_pickaxe",
            () -> new PickaxeItem(ModToolTiers.DEALER, 1, 1, new Item.Properties()));
    public static final RegistryObject<Item> GAMBLERS_AXE = ITEMS.register("gamblers_axe",
            () -> new AxeItem(ModToolTiers.DEALER, 7, 1, new Item.Properties()));
    public static final RegistryObject<Item> GAMBLERS_SHOVEL = ITEMS.register("gamblers_shovel",
            () -> new ShovelItem(ModToolTiers.DEALER, 0, 0, new Item.Properties()));
    public static final RegistryObject<Item> GAMBLERS_HOE = ITEMS.register("gamblers_hoe",
            () -> new HoeItem(ModToolTiers.DEALER, 0, 0, new Item.Properties()));

    public static final RegistryObject<Item> GAMBLERS_HELMET = ITEMS.register("gamblers_helmet",
            () -> new ArmorItem(ModArmorMaterials.DEALER, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> GAMBLERS_CHESTPLATE = ITEMS.register("gamblers_chestplate",
            () -> new ArmorItem(ModArmorMaterials.DEALER, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final RegistryObject<Item> GAMBLERS_LEGGINGS = ITEMS.register("gamblers_leggings",
            () -> new ArmorItem(ModArmorMaterials.DEALER, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final RegistryObject<Item> GAMBLERS_BOOTS = ITEMS.register("gamblers_boots",
            () -> new ArmorItem(ModArmorMaterials.DEALER, ArmorItem.Type.BOOTS, new Item.Properties()));

    public static final RegistryObject<Item> PLAYERS_SWORD = ITEMS.register("players_sword",
            () -> new SwordItem(ModToolTiers.DEALER, 4, 2, new Item.Properties()));
    public static final RegistryObject<Item> PLAYERS_PICKAXE = ITEMS.register("players_pickaxe",
            () -> new PickaxeItem(ModToolTiers.DEALER, 1, 1, new Item.Properties()));
    public static final RegistryObject<Item> PLAYERS_AXE = ITEMS.register("players_axe",
            () -> new AxeItem(ModToolTiers.DEALER, 7, 1, new Item.Properties()));
    public static final RegistryObject<Item> PLAYERS_SHOVEL = ITEMS.register("players_shovel",
            () -> new ShovelItem(ModToolTiers.DEALER, 0, 0, new Item.Properties()));
    public static final RegistryObject<Item> PLAYERS_HOE = ITEMS.register("players_hoe",
            () -> new HoeItem(ModToolTiers.DEALER, 0, 0, new Item.Properties()));

    public static final RegistryObject<Item> PLAYERS_HELMET = ITEMS.register("players_helmet",
            () -> new ArmorItem(ModArmorMaterials.DEALER, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> PLAYERS_CHESTPLATE = ITEMS.register("players_chestplate",
            () -> new ArmorItem(ModArmorMaterials.DEALER, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final RegistryObject<Item> PLAYERS_LEGGINGS = ITEMS.register("players_leggings",
            () -> new ArmorItem(ModArmorMaterials.DEALER, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final RegistryObject<Item> PLAYERS_BOOTS = ITEMS.register("players_boots",
            () -> new ArmorItem(ModArmorMaterials.DEALER, ArmorItem.Type.BOOTS, new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
