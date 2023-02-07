
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.groupproject.advancedmachinery.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import net.groupproject.advancedmachinery.AdvancedmachineryMod;

public class AdvancedmachineryModSounds {
	public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, AdvancedmachineryMod.MODID);
	public static final RegistryObject<SoundEvent> RUSKO_NETSKY_AUDIO = REGISTRY.register("rusko_netsky_audio",
			() -> new SoundEvent(new ResourceLocation("advancedmachinery", "rusko_netsky_audio")));
}
