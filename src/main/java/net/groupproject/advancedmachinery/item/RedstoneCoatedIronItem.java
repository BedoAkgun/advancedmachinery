
package net.groupproject.advancedmachinery.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

import net.groupproject.advancedmachinery.init.AdvancedmachineryModTabs;

public class RedstoneCoatedIronItem extends Item {
	public RedstoneCoatedIronItem() {
		super(new Item.Properties().tab(AdvancedmachineryModTabs.TAB_ADVANCED_MACHIBERY).stacksTo(64).rarity(Rarity.UNCOMMON));
	}
}
