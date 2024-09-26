package net.ethershade.ritualcards.util;

import net.ethershade.ritualcards.Ritualcards;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class ModTags {
    public static class Blocks {
        public static final TagKey<Block> DEALERS_BLOCKS = tag("dealers_blocks");
        public static final TagKey<Block> GAMBLERS_BLOCKS = tag("gamblers_blocks");
        public static final TagKey<Block> PLAYERS_BLOCKS = tag("players_blocks");



        private static TagKey<Block> tag(String name) {
            return BlockTags.create(new ResourceLocation(Ritualcards.MOD_ID, name));
        }
    }

    public static class Items {


        private static TagKey<Item> tag(String name) {
            return ItemTags.create(new ResourceLocation(Ritualcards.MOD_ID, name));
        }
    }
}
