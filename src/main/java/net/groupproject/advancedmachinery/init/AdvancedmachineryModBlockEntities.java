
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.groupproject.advancedmachinery.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.Block;

import net.groupproject.advancedmachinery.block.entity.MixerBlockEntity;
import net.groupproject.advancedmachinery.block.entity.CompressorBlockEntity;
import net.groupproject.advancedmachinery.block.entity.CoaterBlockEntity;
import net.groupproject.advancedmachinery.AdvancedmachineryMod;

public class AdvancedmachineryModBlockEntities {
	public static final DeferredRegister<BlockEntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES,
			AdvancedmachineryMod.MODID);
	public static final RegistryObject<BlockEntityType<?>> MIXER = register("mixer", AdvancedmachineryModBlocks.MIXER, MixerBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> COATER = register("coater", AdvancedmachineryModBlocks.COATER, CoaterBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> COMPRESSOR = register("compressor", AdvancedmachineryModBlocks.COMPRESSOR,
			CompressorBlockEntity::new);

	private static RegistryObject<BlockEntityType<?>> register(String registryname, RegistryObject<Block> block,
			BlockEntityType.BlockEntitySupplier<?> supplier) {
		return REGISTRY.register(registryname, () -> BlockEntityType.Builder.of(supplier, block.get()).build(null));
	}
}
