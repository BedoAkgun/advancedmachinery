
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.groupproject.advancedmachinery.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;

import net.minecraft.world.level.levelgen.feature.Feature;

import net.groupproject.advancedmachinery.world.features.ores.InfiniumOreFeature;
import net.groupproject.advancedmachinery.AdvancedmachineryMod;

@Mod.EventBusSubscriber
public class AdvancedmachineryModFeatures {
	public static final DeferredRegister<Feature<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.FEATURES, AdvancedmachineryMod.MODID);
	public static final RegistryObject<Feature<?>> INFINIUM_ORE = REGISTRY.register("infinium_ore", InfiniumOreFeature::feature);
}
