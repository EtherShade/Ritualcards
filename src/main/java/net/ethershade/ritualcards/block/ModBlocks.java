package net.ethershade.ritualcards.block;

import net.ethershade.ritualcards.Ritualcards;
import net.ethershade.ritualcards.block.custom.InscribingTableBlock;
import net.ethershade.ritualcards.block.custom.PomegranateCropBlock;
import net.ethershade.ritualcards.block.custom.SilverBellBlock;
import net.ethershade.ritualcards.item.ModItems;
import net.ethershade.ritualcards.sound.ModSounds;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, Ritualcards.MOD_ID);

    public static final RegistryObject<Block> STYGIAN_ROCK = registerBlock("stygian_rock",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE)));

    public static final RegistryObject<Block> COBBLED_STYGIAN_ROCK = registerBlock("cobbled_stygian_rock",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.COBBLED_DEEPSLATE)));

    public static final RegistryObject<Block> COBBLED_STYGIAN_ROCK_STAIRS = registerBlock("cobbled_stygian_rock_stairs",
            () -> new StairBlock(() -> ModBlocks.COBBLED_STYGIAN_ROCK.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.COBBLED_DEEPSLATE)));
    public static final RegistryObject<Block> COBBLED_STYGIAN_ROCK_SLAB = registerBlock("cobbled_stygian_rock_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.COBBLED_DEEPSLATE)));

    public static final RegistryObject<Block> COBBLED_STYGIAN_ROCK_BUTTON = registerBlock("cobbled_stygian_rock_button",
            () -> new ButtonBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BUTTON),
                    BlockSetType.STONE, 10, true));
    public static final RegistryObject<Block> COBBLED_STYGIAN_ROCK_PRESSURE_PLATE = registerBlock("cobbled_stygian_rock_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS, BlockBehaviour.Properties.copy(Blocks.COBBLED_DEEPSLATE),
                    BlockSetType.STONE));

    public static final RegistryObject<Block> COBBLED_STYGIAN_ROCK_FENCE = registerBlock("cobbled_stygian_rock_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.COBBLED_DEEPSLATE)));
    public static final RegistryObject<Block> COBBLED_STYGIAN_ROCK_FENCE_GATE = registerBlock("cobbled_stygian_rock_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.COBBLED_DEEPSLATE), SoundEvents.DEEPSLATE_PLACE, SoundEvents.DEEPSLATE_PLACE));
    public static final RegistryObject<Block> COBBLED_STYGIAN_ROCK_WALL = registerBlock("cobbled_stygian_rock_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.COBBLED_DEEPSLATE)));

    public static final RegistryObject<Block> COBBLED_STYGIAN_ROCK_DOOR = registerBlock("cobbled_stygian_rock_door",
            () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.COBBLED_DEEPSLATE).noOcclusion(), BlockSetType.IRON));
    public static final RegistryObject<Block> COBBLED_STYGIAN_ROCK_TRAPDOOR = registerBlock("cobbled_stygian_rock_trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.COBBLED_DEEPSLATE).noOcclusion(), BlockSetType.IRON));

    public static final RegistryObject<Block> POMEGRANATE_CROP = BLOCKS.register("pomegranate_crop",
            () -> new PomegranateCropBlock(BlockBehaviour.Properties.copy(Blocks.WHEAT).noOcclusion().noCollission()));

    public static final RegistryObject<Block> SILVER_BLOCK = registerBlock("silver_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK)));
    public static final RegistryObject<Block> RAW_SILVER_BLOCK = registerBlock("raw_silver_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.RAW_IRON_BLOCK)));

    public static final RegistryObject<Block> SILVER_ORE = registerBlock("silver_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(3f).requiresCorrectToolForDrops(), UniformInt.of(3, 6)));
    public static final RegistryObject<Block> DEEPSLATE_SILVER_ORE = registerBlock("deepslate_silver_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE)
                    .strength(3.5f).requiresCorrectToolForDrops(), UniformInt.of(4, 6)));
    public static final RegistryObject<Block> END_SILVER_ORE = registerBlock("end_silver_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.END_STONE)
                    .strength(5f).requiresCorrectToolForDrops(), UniformInt.of(5, 6)));

    public static final RegistryObject<Block> SILVER_BELL = registerBlock("silver_bell",
            () -> new SilverBellBlock(BlockBehaviour.Properties.copy(Blocks.BELL).sound(ModSounds.SILVER_BELL_SOUNDS)));

    public static final RegistryObject<Block> INSCRIBING_TABLE = registerBlock("inscribing_table",
            () -> new InscribingTableBlock(BlockBehaviour.Properties.copy(Blocks.COBBLED_DEEPSLATE).noOcclusion()));

    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block>RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
