
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.groupproject.advancedmachinery.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import net.groupproject.advancedmachinery.item.RuskoEverydayDiscItem;
import net.groupproject.advancedmachinery.item.IronRodItem;
import net.groupproject.advancedmachinery.item.Ingot1Item;
import net.groupproject.advancedmachinery.item.InfiniumItem;
import net.groupproject.advancedmachinery.item.DiamondScrapMixtureItem;
import net.groupproject.advancedmachinery.item.DiamondRodItem;
import net.groupproject.advancedmachinery.item.DiamondMetalSwordItem;
import net.groupproject.advancedmachinery.item.DiamondMetalShovelItem;
import net.groupproject.advancedmachinery.item.DiamondMetalRodItem;
import net.groupproject.advancedmachinery.item.DiamondMetalPickaxeItem;
import net.groupproject.advancedmachinery.item.DiamondMetalPaxelItem;
import net.groupproject.advancedmachinery.item.DiamondMetalHoeItem;
import net.groupproject.advancedmachinery.item.DiamondMetalAxeItem;
import net.groupproject.advancedmachinery.AdvancedmachineryMod;

public class AdvancedmachineryModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, AdvancedmachineryMod.MODID);
	public static final RegistryObject<Item> INGOT_1 = REGISTRY.register("ingot_1", () -> new Ingot1Item());
	public static final RegistryObject<Item> DIAMOND_METAL_BLOCK = block(AdvancedmachineryModBlocks.DIAMOND_METAL_BLOCK,
			CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> IRON_MACHINE_CASING = block(AdvancedmachineryModBlocks.IRON_MACHINE_CASING,
			AdvancedmachineryModTabs.TAB_ADVANCED_MACHIBERY);
	public static final RegistryObject<Item> DIAMOND_MACHINE_CASING = block(AdvancedmachineryModBlocks.DIAMOND_MACHINE_CASING,
			AdvancedmachineryModTabs.TAB_ADVANCED_MACHIBERY);
	public static final RegistryObject<Item> DIAMOND_METAL_MACHINE_CASING = block(AdvancedmachineryModBlocks.DIAMOND_METAL_MACHINE_CASING,
			AdvancedmachineryModTabs.TAB_ADVANCED_MACHIBERY);
	public static final RegistryObject<Item> IRON_ROD = REGISTRY.register("iron_rod", () -> new IronRodItem());
	public static final RegistryObject<Item> DIAMOND_ROD = REGISTRY.register("diamond_rod", () -> new DiamondRodItem());
	public static final RegistryObject<Item> DIAMOND_METAL_ROD = REGISTRY.register("diamond_metal_rod", () -> new DiamondMetalRodItem());
	public static final RegistryObject<Item> DIAMOND_METAL_PICKAXE = REGISTRY.register("diamond_metal_pickaxe", () -> new DiamondMetalPickaxeItem());
	public static final RegistryObject<Item> DIAMOND_METAL_SHOVEL = REGISTRY.register("diamond_metal_shovel", () -> new DiamondMetalShovelItem());
	public static final RegistryObject<Item> DIAMOND_METAL_HOE = REGISTRY.register("diamond_metal_hoe", () -> new DiamondMetalHoeItem());
	public static final RegistryObject<Item> DIAMOND_METAL_AXE = REGISTRY.register("diamond_metal_axe", () -> new DiamondMetalAxeItem());
	public static final RegistryObject<Item> DIAMOND_METAL_SWORD = REGISTRY.register("diamond_metal_sword", () -> new DiamondMetalSwordItem());
	public static final RegistryObject<Item> DIAMOND_METAL_PAXEL = REGISTRY.register("diamond_metal_paxel", () -> new DiamondMetalPaxelItem());
	public static final RegistryObject<Item> INFINIUM = REGISTRY.register("infinium", () -> new InfiniumItem());
	public static final RegistryObject<Item> RUSKO_EVERYDAY_DISC = REGISTRY.register("rusko_everyday_disc", () -> new RuskoEverydayDiscItem());
	public static final RegistryObject<Item> MIXER = block(AdvancedmachineryModBlocks.MIXER, AdvancedmachineryModTabs.TAB_ADVANCED_MACHIBERY);
	public static final RegistryObject<Item> DIAMOND_SCRAP_MIXTURE = REGISTRY.register("diamond_scrap_mixture", () -> new DiamondScrapMixtureItem());

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
