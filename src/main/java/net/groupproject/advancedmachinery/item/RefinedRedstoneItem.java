
package net.groupproject.advancedmachinery.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

import net.groupproject.advancedmachinery.init.AdvancedmachineryModTabs;

public class RefinedRedstoneItem extends Item {
	public RefinedRedstoneItem() {
		super(new Item.Properties().tab(AdvancedmachineryModTabs.TAB_ADVANCED_MACHIBERY).stacksTo(64).rarity(Rarity.COMMON));
	}
}
