package net.ethershade.ritualcards.item;

import net.ethershade.ritualcards.Ritualcards;
import net.ethershade.ritualcards.util.ModTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Tiers;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.TierSortingRegistry;

import java.util.List;

public class ModToolTiers {
    public static final Tier COPPER = TierSortingRegistry.registerTier(
            new ForgeTier(3, 131, 4.0f, 4f, 25,
                    ModTags.Blocks.SILVER_FAST_BLOCKS, () -> Ingredient.of(Items.COPPER_INGOT)),
            new ResourceLocation(Ritualcards.MOD_ID, "copper"), List.of(Tiers.NETHERITE), List.of());
    public static final Tier SILVER = TierSortingRegistry.registerTier(
            new ForgeTier(3, 131, 4.0f, 4f, 25,
                    ModTags.Blocks.SILVER_FAST_BLOCKS, () -> Ingredient.of(ModItems.SILVER_INGOT.get())),
            new ResourceLocation(Ritualcards.MOD_ID, "silver"), List.of(Tiers.NETHERITE), List.of());
    public static final Tier STUDDED_BONE = TierSortingRegistry.registerTier(
            new ForgeTier(3, 131, 4.0f, 4f, 25,
                    ModTags.Blocks.SILVER_FAST_BLOCKS, () -> Ingredient.of(ModItems.STUDDED_BONE.get())),
            new ResourceLocation(Ritualcards.MOD_ID, "studded_bone"), List.of(Tiers.NETHERITE), List.of());
}
