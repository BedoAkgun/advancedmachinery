
package net.groupproject.advancedmachinery.item;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.UseAnim;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.network.chat.Component;

import net.groupproject.advancedmachinery.init.AdvancedmachineryModTabs;

import java.util.List;

public class InfiniumItem extends Item {
	public InfiniumItem() {
		super(new Item.Properties().tab(AdvancedmachineryModTabs.TAB_ADVANCED_MACHIBERY).stacksTo(64).fireResistant().rarity(Rarity.EPIC)
				.food((new FoodProperties.Builder()).nutrition(14).saturationMod(1.5f)

						.build()));
	}

	@Override
	public UseAnim getUseAnimation(ItemStack itemstack) {
		return UseAnim.NONE;
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}

	@Override
	@OnlyIn(Dist.CLIENT)
	public boolean isFoil(ItemStack itemstack) {
		return true;
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(Component.literal("goofy thing"));
	}
}
