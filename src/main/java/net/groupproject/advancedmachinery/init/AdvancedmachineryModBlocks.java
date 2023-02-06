
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.groupproject.advancedmachinery.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.groupproject.advancedmachinery.block.IronMachineCasingBlock;
import net.groupproject.advancedmachinery.block.DiamondMetalMachineCasingBlock;
import net.groupproject.advancedmachinery.block.DiamondMetalBlockBlock;
import net.groupproject.advancedmachinery.block.DiamondMachineCasingBlock;
import net.groupproject.advancedmachinery.AdvancedmachineryMod;

public class AdvancedmachineryModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, AdvancedmachineryMod.MODID);
	public static final RegistryObject<Block> DIAMOND_METAL_BLOCK = REGISTRY.register("diamond_metal_block", () -> new DiamondMetalBlockBlock());
	public static final RegistryObject<Block> IRON_MACHINE_CASING = REGISTRY.register("iron_machine_casing", () -> new IronMachineCasingBlock());
	public static final RegistryObject<Block> DIAMOND_MACHINE_CASING = REGISTRY.register("diamond_machine_casing",
			() -> new DiamondMachineCasingBlock());
	public static final RegistryObject<Block> DIAMOND_METAL_MACHINE_CASING = REGISTRY.register("diamond_metal_machine_casing",
			() -> new DiamondMetalMachineCasingBlock());
}
