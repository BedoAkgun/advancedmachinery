
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.groupproject.advancedmachinery.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.groupproject.advancedmachinery.block.RefinedRedstoneBlockBlock;
import net.groupproject.advancedmachinery.block.MixerBlock;
import net.groupproject.advancedmachinery.block.IronMachineCasingBlock;
import net.groupproject.advancedmachinery.block.InfiniumOreBlock;
import net.groupproject.advancedmachinery.block.DiamondMetalMachineCasingBlock;
import net.groupproject.advancedmachinery.block.DiamondMetalBlockBlock;
import net.groupproject.advancedmachinery.block.DiamondMachineCasingBlock;
import net.groupproject.advancedmachinery.block.CompressorBlock;
import net.groupproject.advancedmachinery.block.CoaterBlock;
import net.groupproject.advancedmachinery.AdvancedmachineryMod;

public class AdvancedmachineryModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, AdvancedmachineryMod.MODID);
	public static final RegistryObject<Block> DIAMOND_METAL_BLOCK = REGISTRY.register("diamond_metal_block", () -> new DiamondMetalBlockBlock());
	public static final RegistryObject<Block> IRON_MACHINE_CASING = REGISTRY.register("iron_machine_casing", () -> new IronMachineCasingBlock());
	public static final RegistryObject<Block> DIAMOND_MACHINE_CASING = REGISTRY.register("diamond_machine_casing",
			() -> new DiamondMachineCasingBlock());
	public static final RegistryObject<Block> DIAMOND_METAL_MACHINE_CASING = REGISTRY.register("diamond_metal_machine_casing",
			() -> new DiamondMetalMachineCasingBlock());
	public static final RegistryObject<Block> MIXER = REGISTRY.register("mixer", () -> new MixerBlock());
	public static final RegistryObject<Block> INFINIUM_ORE = REGISTRY.register("infinium_ore", () -> new InfiniumOreBlock());
	public static final RegistryObject<Block> COATER = REGISTRY.register("coater", () -> new CoaterBlock());
	public static final RegistryObject<Block> REFINED_REDSTONE_BLOCK = REGISTRY.register("refined_redstone_block",
			() -> new RefinedRedstoneBlockBlock());
	public static final RegistryObject<Block> COMPRESSOR = REGISTRY.register("compressor", () -> new CompressorBlock());
}
