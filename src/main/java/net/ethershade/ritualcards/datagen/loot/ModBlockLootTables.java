package net.ethershade.ritualcards.datagen.loot;

import net.ethershade.ritualcards.block.ModBlocks;
import net.ethershade.ritualcards.item.ModItems;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.functions.ApplyBonusCount;
import net.minecraft.world.level.storage.loot.functions.SetItemCountFunction;
import net.minecraft.world.level.storage.loot.providers.number.UniformGenerator;
import net.minecraftforge.registries.RegistryObject;

import java.util.Set;

public class ModBlockLootTables extends BlockLootSubProvider {
    public ModBlockLootTables() {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags());
    }

    @Override
    protected void generate() {
        this.add(ModBlocks.STYGIAN_ROCK.get(),
                block -> createOreDrop(ModBlocks.STYGIAN_ROCK.get(), Item.byBlock(ModBlocks.COBBLED_STYGIAN_ROCK.get())));
        this.dropSelf(ModBlocks.COBBLED_STYGIAN_ROCK.get());

        this.dropSelf(ModBlocks.COBBLED_STYGIAN_ROCK_STAIRS.get());
        this.dropSelf(ModBlocks.COBBLED_STYGIAN_ROCK_BUTTON.get());
        this.dropSelf(ModBlocks.COBBLED_STYGIAN_ROCK_PRESSURE_PLATE.get());
        this.dropSelf(ModBlocks.COBBLED_STYGIAN_ROCK_TRAPDOOR.get());
        this.dropSelf(ModBlocks.COBBLED_STYGIAN_ROCK_FENCE.get());
        this.dropSelf(ModBlocks.COBBLED_STYGIAN_ROCK_FENCE_GATE.get());
        this.dropSelf(ModBlocks.COBBLED_STYGIAN_ROCK_WALL.get());

        this.add(ModBlocks.COBBLED_STYGIAN_ROCK_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.COBBLED_STYGIAN_ROCK_SLAB.get()));
        this.add(ModBlocks.COBBLED_STYGIAN_ROCK_DOOR.get(),
                block -> createDoorTable(ModBlocks.COBBLED_STYGIAN_ROCK_DOOR.get()));

        this.dropSelf(ModBlocks.SILVER_BLOCK.get());
        this.dropSelf(ModBlocks.RAW_SILVER_BLOCK.get());
        this.dropSelf(ModBlocks.SILVER_BELL.get());

        this.add(ModBlocks.SILVER_ORE.get(),
                block -> createOreDrop(ModBlocks.SILVER_ORE.get(), ModItems.RAW_SILVER.get()));
        this.add(ModBlocks.DEEPSLATE_SILVER_ORE.get(),
                block -> createOreDrop(ModBlocks.SILVER_ORE.get(), ModItems.RAW_SILVER.get()));
        this.add(ModBlocks.END_SILVER_ORE.get(),
                block -> createTwoOrThreeOreDrops(ModBlocks.SILVER_ORE.get(), ModItems.RAW_SILVER.get()));
    }

    protected LootTable.Builder createTwoOrThreeOreDrops(Block pBlock, Item item) {
        return createSilkTouchDispatchTable(pBlock,
                this.applyExplosionDecay(pBlock,
                        LootItem.lootTableItem(item)
                                .apply(SetItemCountFunction.setCount(UniformGenerator.between(2.0F, 3.0F)))
                                .apply(ApplyBonusCount.addOreBonusCount(Enchantments.BLOCK_FORTUNE))));
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}
