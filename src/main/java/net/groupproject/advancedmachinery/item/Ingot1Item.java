
package net.groupproject.advancedmachinery.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.network.chat.Component;

import net.groupproject.advancedmachinery.init.AdvancedmachineryModTabs;

import java.util.List;

public class Ingot1Item extends Item {
	public Ingot1Item() {
		super(new Item.Properties().tab(AdvancedmachineryModTabs.TAB_ADVANCED_MACHIBERY).stacksTo(64).rarity(Rarity.COMMON));
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(Component.literal("Iron Ingot covered in a mixture of diamond and netherite debris"));
	}
}
