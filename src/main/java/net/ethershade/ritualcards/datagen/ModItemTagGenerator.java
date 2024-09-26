package net.ethershade.ritualcards.datagen;

import net.ethershade.ritualcards.Ritualcards;
import net.ethershade.ritualcards.item.ModItems;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModItemTagGenerator extends ItemTagsProvider {
    public ModItemTagGenerator(PackOutput p_275343_, CompletableFuture<HolderLookup.Provider> p_275729_, CompletableFuture<TagLookup<Block>> p_275322_, @Nullable ExistingFileHelper existingFileHelper) {
        super(p_275343_, p_275729_, p_275322_, Ritualcards.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider pProvider) {
        this.tag(ItemTags.TRIMMABLE_ARMOR)
                .add(ModItems.DEALERS_HELMET.get())
                .add(ModItems.DEALERS_CHESTPLATE.get())
                .add(ModItems.DEALERS_LEGGINGS.get())
                .add(ModItems.DEALERS_BOOTS.get())
                .add(ModItems.GAMBLERS_HELMET.get())
                .add(ModItems.GAMBLERS_CHESTPLATE.get())
                .add(ModItems.GAMBLERS_LEGGINGS.get())
                .add(ModItems.GAMBLERS_BOOTS.get())
                .add(ModItems.PLAYERS_HELMET.get())
                .add(ModItems.PLAYERS_CHESTPLATE.get())
                .add(ModItems.PLAYERS_LEGGINGS.get())
                .add(ModItems.PLAYERS_BOOTS.get());
    }
}
