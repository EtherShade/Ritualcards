package net.ethershade.ritualcards.item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class ModFoods {
    public static final FoodProperties SILVER_BERRY = new FoodProperties.Builder().nutrition(2)
            .saturationMod(2.5f).effect(() -> new MobEffectInstance(MobEffects.DARKNESS, 40), 1f).build();
}
