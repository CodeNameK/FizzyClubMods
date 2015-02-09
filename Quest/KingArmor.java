package FizzyClubMods.Quest;

import FizzyClubMods.Items.FizzyClubItems;
import net.minecraft.entity.Entity;
import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

public class KingArmor extends ItemArmor
{
	public KingArmor(int par1,EnumArmorMaterial par2EnumArmorMaterial, int par3, int par4)
	{
		super(par1, par2EnumArmorMaterial, par3, par4);
	}
	@Override
	public String getArmorTexture(ItemStack stack, Entity entity, int slot,
	String type) {
	if (stack.getItem() == FizzyClubItems.kinghelmet || stack.getItem() == FizzyClubItems.kingchestplate || stack.getItem() == FizzyClubItems.kingboot) {
		return "textures/armors/king_1.png";
	}
	if (stack.getItem() == FizzyClubItems.kinglegging) {
		return "textures/armors/king_2.png";
	}
	return null;
	}
}
