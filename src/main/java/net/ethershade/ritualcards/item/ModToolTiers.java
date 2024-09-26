package net.ethershade.ritualcards.item;

import net.ethershade.ritualcards.Ritualcards;
import net.ethershade.ritualcards.util.ModTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Tiers;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.common.TierSortingRegistry;

import java.util.List;

public class ModToolTiers {
    public static final Tier DEALER = TierSortingRegistry.registerTier(
            new ForgeTier(3, 131, 4.0f, 4f, 25,
                    ModTags.Blocks.DEALERS_BLOCKS, () -> Ingredient.of(ModItems.BLANK_CARD.get())),
            new ResourceLocation(Ritualcards.MOD_ID, "dealer"), List.of(Tiers.NETHERITE), List.of());
    public static final Tier GAMBLER = TierSortingRegistry.registerTier(
            new ForgeTier(3, 131, 4.0f, 4f, 25,
                    ModTags.Blocks.GAMBLERS_BLOCKS, () -> Ingredient.of(ModItems.BLANK_CARD.get())),
            new ResourceLocation(Ritualcards.MOD_ID, "gambler"), List.of(Tiers.NETHERITE), List.of());
    public static final Tier PLAYER = TierSortingRegistry.registerTier(
            new ForgeTier(3, 131, 4.0f, 4f, 25,
                    ModTags.Blocks.PLAYERS_BLOCKS, () -> Ingredient.of(ModItems.BLANK_CARD.get())),
            new ResourceLocation(Ritualcards.MOD_ID, "player"), List.of(Tiers.NETHERITE), List.of());
}
