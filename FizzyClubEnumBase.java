package FizzyClubMods;

import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.EnumToolMaterial;
import net.minecraftforge.common.EnumHelper;

public class FizzyClubEnumBase {
	public static EnumArmorMaterial EmeraldArmors = EnumHelper
			.addArmorMaterial("EmeraldArmors", 50, new int[] { 6, 6, 6, 6 }, 80);
	public static EnumToolMaterial EmeraldTools = EnumHelper.addToolMaterial(
			"EmeraldTools", 4, 1499, 5.0F, 12, 80);
	public static EnumArmorMaterial kingArmors = EnumHelper.addArmorMaterial("kingArmors", 55, new int[]{6, 6, 6, 6}, 80);
	public static EnumToolMaterial QueenSwords = EnumHelper.addToolMaterial("QueenSwords", 0, 599, 0.0F, 0, 80);
}