package net.ethershade.ritualcards.item;

import net.ethershade.ritualcards.Ritualcards;
import net.ethershade.ritualcards.block.ModBlocks;
import net.ethershade.ritualcards.item.custom.FuelItem;
import net.ethershade.ritualcards.item.custom.RodOfLazinessItem;
import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, Ritualcards.MOD_ID);

    public static final RegistryObject<Item> SILVER_INGOT = ITEMS.register("silver_ingot",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> STUDDED_LEATHER = ITEMS.register("studded_leather",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> STUDDED_BONE = ITEMS.register("studded_bone",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> RAW_SILVER = ITEMS.register("raw_silver",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> SILVER_BERRY = ITEMS.register("silver_berry",
            () -> new Item(new Item.Properties().food(ModFoods.SILVER_BERRY)));

    public static final RegistryObject<Item> POMEGRANATE = ITEMS.register("pomegranate",
            () -> new Item(new Item.Properties().food(ModFoods.POMEGRANATE)));

    public static final RegistryObject<Item> POMEGRANATE_SEEDS = ITEMS.register("pomegranate_seeds",
            () -> new ItemNameBlockItem(ModBlocks.POMEGRANATE_CROP.get(), new Item.Properties()));

    public static final RegistryObject<Item> ROD_OF_LAZINESS = ITEMS.register("rod_of_laziness",
            () -> new RodOfLazinessItem(new Item.Properties().durability(100)));

    public static final RegistryObject<Item> BLANK_CARD = ITEMS.register("blank_card",
            () -> new FuelItem(new Item.Properties(), 800));


    public static final RegistryObject<Item> COPPER_SWORD = ITEMS.register("copper_sword",
            () -> new SwordItem(ModToolTiers.COPPER, 4, 2, new Item.Properties()));
    public static final RegistryObject<Item> COPPER_PICKAXE = ITEMS.register("copper_pickaxe",
            () -> new PickaxeItem(ModToolTiers.COPPER, 1, 1, new Item.Properties()));
    public static final RegistryObject<Item> COPPER_AXE = ITEMS.register("copper_axe",
            () -> new AxeItem(ModToolTiers.COPPER, 7, 1, new Item.Properties()));
    public static final RegistryObject<Item> COPPER_SHOVEL = ITEMS.register("copper_shovel",
            () -> new ShovelItem(ModToolTiers.COPPER, 0, 0, new Item.Properties()));
    public static final RegistryObject<Item> COPPER_HOE = ITEMS.register("copper_hoe",
            () -> new HoeItem(ModToolTiers.COPPER, 0, 0, new Item.Properties()));
    public static final RegistryObject<Item> SILVER_SWORD = ITEMS.register("silver_sword",
            () -> new SwordItem(ModToolTiers.SILVER, 4, 2, new Item.Properties()));
    public static final RegistryObject<Item> SILVER_PICKAXE = ITEMS.register("silver_pickaxe",
            () -> new PickaxeItem(ModToolTiers.SILVER, 1, 1, new Item.Properties()));
    public static final RegistryObject<Item> SILVER_AXE = ITEMS.register("silver_axe",
            () -> new AxeItem(ModToolTiers.SILVER, 7, 1, new Item.Properties()));
    public static final RegistryObject<Item> SILVER_SHOVEL = ITEMS.register("silver_shovel",
            () -> new ShovelItem(ModToolTiers.SILVER, 0, 0, new Item.Properties()));
    public static final RegistryObject<Item> SILVER_HOE = ITEMS.register("silver_hoe",
            () -> new HoeItem(ModToolTiers.SILVER, 0, 0, new Item.Properties()));
    public static final RegistryObject<Item> STUDDED_BONE_DAGGER = ITEMS.register("studded_bone_dagger",
            () -> new SwordItem(ModToolTiers.STUDDED_BONE, 1, 3, new Item.Properties()));

    public static final RegistryObject<Item> COPPER_HELMET = ITEMS.register("copper_helmet",
            () -> new ArmorItem(ModArmorMaterials.COPPER, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> COPPER_CHESTPLATE = ITEMS.register("copper_chestplate",
            () -> new ArmorItem(ModArmorMaterials.COPPER, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final RegistryObject<Item> COPPER_LEGGINGS = ITEMS.register("copper_leggings",
            () -> new ArmorItem(ModArmorMaterials.COPPER, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final RegistryObject<Item> COPPER_BOOTS = ITEMS.register("copper_boots",
            () -> new ArmorItem(ModArmorMaterials.COPPER, ArmorItem.Type.BOOTS, new Item.Properties()));
    public static final RegistryObject<Item> SILVER_HELMET = ITEMS.register("silver_helmet",
            () -> new ArmorItem(ModArmorMaterials.SILVER, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> SILVER_CHESTPLATE = ITEMS.register("silver_chestplate",
            () -> new ArmorItem(ModArmorMaterials.SILVER, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final RegistryObject<Item> SILVER_LEGGINGS = ITEMS.register("silver_leggings",
            () -> new ArmorItem(ModArmorMaterials.SILVER, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final RegistryObject<Item> SILVER_BOOTS = ITEMS.register("silver_boots",
            () -> new ArmorItem(ModArmorMaterials.SILVER, ArmorItem.Type.BOOTS, new Item.Properties()));
    public static final RegistryObject<Item> STUDDED_LEATHER_HELMET = ITEMS.register("studded_leather_helmet",
            () -> new ArmorItem(ModArmorMaterials.STUDDED_LEATHER, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> STUDDED_LEATHER_CHESTPLATE = ITEMS.register("studded_leather_chestplate",
            () -> new ArmorItem(ModArmorMaterials.STUDDED_LEATHER, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final RegistryObject<Item> STUDDED_LEATHER_LEGGINGS = ITEMS.register("studded_leather_leggings",
            () -> new ArmorItem(ModArmorMaterials.STUDDED_LEATHER, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final RegistryObject<Item> STUDDED_LEATHER_BOOTS = ITEMS.register("studded_leather_boots",
            () -> new ArmorItem(ModArmorMaterials.STUDDED_LEATHER, ArmorItem.Type.BOOTS, new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
