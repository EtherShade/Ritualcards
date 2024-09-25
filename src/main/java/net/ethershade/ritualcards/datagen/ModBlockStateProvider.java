package net.ethershade.ritualcards.datagen;

import net.ethershade.ritualcards.Ritualcards;
import net.ethershade.ritualcards.block.ModBlocks;
import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.*;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

public class ModBlockStateProvider extends BlockStateProvider {
    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, Ritualcards.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        blockWithItem(ModBlocks.STYGIAN_ROCK);

        blockWithItem(ModBlocks.COBBLED_STYGIAN_ROCK);

        stairsBlock(((StairBlock) ModBlocks.COBBLED_STYGIAN_ROCK_STAIRS.get()), blockTexture(ModBlocks.COBBLED_STYGIAN_ROCK.get()));
        slabBlock(((SlabBlock) ModBlocks.COBBLED_STYGIAN_ROCK_SLAB.get()), blockTexture(ModBlocks.COBBLED_STYGIAN_ROCK.get()), blockTexture(ModBlocks.COBBLED_STYGIAN_ROCK.get()));

        buttonBlock(((ButtonBlock) ModBlocks.COBBLED_STYGIAN_ROCK_BUTTON.get()), blockTexture(ModBlocks.COBBLED_STYGIAN_ROCK.get()));
        pressurePlateBlock(((PressurePlateBlock) ModBlocks.COBBLED_STYGIAN_ROCK_PRESSURE_PLATE.get()), blockTexture(ModBlocks.COBBLED_STYGIAN_ROCK.get()));

        fenceBlock(((FenceBlock) ModBlocks.COBBLED_STYGIAN_ROCK_FENCE.get()), blockTexture(ModBlocks.COBBLED_STYGIAN_ROCK.get()));
        fenceGateBlock(((FenceGateBlock) ModBlocks.COBBLED_STYGIAN_ROCK_FENCE_GATE.get()), blockTexture(ModBlocks.COBBLED_STYGIAN_ROCK.get()));
        wallBlock(((WallBlock) ModBlocks.COBBLED_STYGIAN_ROCK_WALL.get()), blockTexture(ModBlocks.COBBLED_STYGIAN_ROCK.get()));

        doorBlockWithRenderType(((DoorBlock) ModBlocks.COBBLED_STYGIAN_ROCK_DOOR.get()),
             modLoc("block/cobbled_stygian_rock_door_bottom"), modLoc("block/cobbled_stygian_rock_door_top"), "cutout");
        trapdoorBlockWithRenderType(((TrapDoorBlock) ModBlocks.COBBLED_STYGIAN_ROCK_TRAPDOOR.get()),
                modLoc("block/cobbled_stygian_rock_trapdoor"), true, "cutout");

        blockWithItem(ModBlocks.SILVER_BLOCK);
        blockWithItem(ModBlocks.RAW_SILVER_BLOCK);

        blockWithItem(ModBlocks.SILVER_ORE);
        blockWithItem(ModBlocks.DEEPSLATE_SILVER_ORE);
        blockWithItem(ModBlocks.END_SILVER_ORE);

        blockWithItem(ModBlocks.SILVER_BELL);
    }

    private void blockWithItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(), cubeAll(blockRegistryObject.get()));
    }
}
