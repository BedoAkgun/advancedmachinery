
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.groupproject.advancedmachinery.init;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.gui.screens.MenuScreens;

import net.groupproject.advancedmachinery.client.gui.MixerGUIScreen;
import net.groupproject.advancedmachinery.client.gui.CompactorGUIScreen;
import net.groupproject.advancedmachinery.client.gui.CoaterGUIScreen;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class AdvancedmachineryModScreens {
	@SubscribeEvent
	public static void clientLoad(FMLClientSetupEvent event) {
		event.enqueueWork(() -> {
			MenuScreens.register(AdvancedmachineryModMenus.MIXER_GUI.get(), MixerGUIScreen::new);
			MenuScreens.register(AdvancedmachineryModMenus.COATER_GUI.get(), CoaterGUIScreen::new);
			MenuScreens.register(AdvancedmachineryModMenus.COMPACTOR_GUI.get(), CompactorGUIScreen::new);
		});
	}
}
