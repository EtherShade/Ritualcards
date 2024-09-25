package net.ethershade.ritualcards.sound;

import net.ethershade.ritualcards.Ritualcards;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraftforge.common.util.ForgeSoundType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModSounds {
    public static final DeferredRegister<SoundEvent> SOUND_EVENTS =
            DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, Ritualcards.MOD_ID);

    public static final RegistryObject<SoundEvent> ROD_OF_LAZINESS_TELEPORTED = registerSoundEvents("rod_of_laziness_teleported");
    public static final RegistryObject<SoundEvent> SILVER_BELL_BREAK = registerSoundEvents("silver_bell_break");
    public static final RegistryObject<SoundEvent> SILVER_BELL_STEP = registerSoundEvents("silver_bell_step");
    public static final RegistryObject<SoundEvent> SILVER_BELL_FALL = registerSoundEvents("silver_bell_fall");
    public static final RegistryObject<SoundEvent> SILVER_BELL_PLACE = registerSoundEvents("silver_bell_place");
    public static final RegistryObject<SoundEvent> SILVER_BELL_HIT = registerSoundEvents("silver_bell_hit");


    public static final ForgeSoundType SILVER_BELL_SOUNDS = new ForgeSoundType(1f, 1f,
            ModSounds.SILVER_BELL_BREAK, ModSounds.SILVER_BELL_STEP, ModSounds.SILVER_BELL_PLACE,
            ModSounds.SILVER_BELL_HIT, ModSounds.SILVER_BELL_FALL);

    private static RegistryObject<SoundEvent> registerSoundEvents(String name) {
        return SOUND_EVENTS.register(name, () -> SoundEvent.createVariableRangeEvent(new ResourceLocation(Ritualcards.MOD_ID, name)));
    }

    public static void register(IEventBus eventBus) {
        SOUND_EVENTS.register(eventBus);
    }
}
