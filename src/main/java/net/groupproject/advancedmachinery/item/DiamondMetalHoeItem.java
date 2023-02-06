
package net.groupproject.advancedmachinery.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.HoeItem;
import net.minecraft.world.item.CreativeModeTab;

import net.groupproject.advancedmachinery.init.AdvancedmachineryModItems;

public class DiamondMetalHoeItem extends HoeItem {
	public DiamondMetalHoeItem() {
		super(new Tier() {
			public int getUses() {
				return 3482;
			}

			public float getSpeed() {
				return 12f;
			}

			public float getAttackDamageBonus() {
				return 4f;
			}

			public int getLevel() {
				return 5;
			}

			public int getEnchantmentValue() {
				return 25;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(AdvancedmachineryModItems.INGOT_1.get()));
			}
		}, 0, -2.3f, new Item.Properties().tab(CreativeModeTab.TAB_TOOLS));
	}
}
