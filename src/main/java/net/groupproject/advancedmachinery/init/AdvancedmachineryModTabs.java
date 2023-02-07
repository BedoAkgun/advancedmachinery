
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.groupproject.advancedmachinery.init;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class AdvancedmachineryModTabs {
	public static CreativeModeTab TAB_ADVANCED_MACHIBERY;

	public static void load() {
		TAB_ADVANCED_MACHIBERY = new CreativeModeTab("tabadvanced_machibery") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(AdvancedmachineryModItems.INGOT_1.get());
			}

			@Override
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
}
