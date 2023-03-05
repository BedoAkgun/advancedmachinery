
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.groupproject.advancedmachinery.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.extensions.IForgeMenuType;

import net.minecraft.world.inventory.MenuType;

import net.groupproject.advancedmachinery.world.inventory.MixerGUIMenu;
import net.groupproject.advancedmachinery.world.inventory.CompactorGUIMenu;
import net.groupproject.advancedmachinery.world.inventory.CoaterGUIMenu;
import net.groupproject.advancedmachinery.AdvancedmachineryMod;

public class AdvancedmachineryModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.MENU_TYPES, AdvancedmachineryMod.MODID);
	public static final RegistryObject<MenuType<MixerGUIMenu>> MIXER_GUI = REGISTRY.register("mixer_gui",
			() -> IForgeMenuType.create(MixerGUIMenu::new));
	public static final RegistryObject<MenuType<CoaterGUIMenu>> COATER_GUI = REGISTRY.register("coater_gui",
			() -> IForgeMenuType.create(CoaterGUIMenu::new));
	public static final RegistryObject<MenuType<CompactorGUIMenu>> COMPACTOR_GUI = REGISTRY.register("compactor_gui",
			() -> IForgeMenuType.create(CompactorGUIMenu::new));
}
