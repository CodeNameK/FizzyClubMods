package FizzyClubMods.Blocks;

import FizzyClubMods.FizzyClubBlock;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class FizzyClubBlocks {

	public static Block put;

	public static Block protect50;
	public static Block protect40;
	public static Block protect30;
	public static Block protect20;
	public static Block protect10;
	public static Block protectnopvp;
	public static Block protectheal;

	public static void init() {
		addBlocks();
	}

	private static void addBlocks() {

		// Set Block

		put = new FizzyClubBlock(3017, Material.rock)
				.setStepSound(Block.soundGlassFootstep).setBlockUnbreakable()
				.setResistance(9999.0F).setLightValue(1.0F)
				.setUnlocalizedName("put").setTextureName("put");
		LanguageRegistry.addName(put, "Put Block");
		GameRegistry.registerBlock(put, "Put Block");

		protect10 = new FizzyClubBlock(3018, Material.rock)
				.setStepSound(Block.soundGlassFootstep).setHardness(30.0F)
				.setResistance(30.0F).setLightValue(1.0F)
				.setUnlocalizedName("protect10").setTextureName("protect10");
		LanguageRegistry.addName(protect10, "10X10 Protect");
		GameRegistry.registerBlock(protect10, "10X10 Protect");
		protect20 = new FizzyClubBlock(3019, Material.rock)
				.setStepSound(Block.soundGlassFootstep).setHardness(30.0F)
				.setResistance(30.0F).setLightValue(1.0F)
				.setUnlocalizedName("protect20").setTextureName("protect20");
		LanguageRegistry.addName(protect20, "20X20 Protect");
		GameRegistry.registerBlock(protect20, "20X20 Protect");
		protect30 = new FizzyClubBlock(3020, Material.rock)
				.setStepSound(Block.soundGlassFootstep).setHardness(30.0F)
				.setResistance(30.0F).setLightValue(1.0F)
				.setUnlocalizedName("protect30").setTextureName("protect30");
		LanguageRegistry.addName(protect30, "30X30 Protect");
		GameRegistry.registerBlock(protect30, "30X30 Protect");
		protect40 = new FizzyClubBlock(3021, Material.rock)
				.setStepSound(Block.soundGlassFootstep).setHardness(30.0F)
				.setResistance(30.0F).setLightValue(1.0F)
				.setUnlocalizedName("protect40").setTextureName("protect40");
		LanguageRegistry.addName(protect40, "40X40 Protect");
		GameRegistry.registerBlock(protect40, "40X40 Protect");
		protect50 = new FizzyClubBlock(3022, Material.rock)
				.setStepSound(Block.soundGlassFootstep).setHardness(30.0F)
				.setResistance(30.0F).setLightValue(1.0F)
				.setUnlocalizedName("protect50").setTextureName("protect50");
		LanguageRegistry.addName(protect50, "50X50 Protect");
		GameRegistry.registerBlock(protect50, "50X50 Protect");
		protectheal = new FizzyClubBlock(3023, Material.rock)
				.setStepSound(Block.soundGlassFootstep).setHardness(30.0F)
				.setResistance(30.0F).setLightValue(1.0F)
				.setUnlocalizedName("protectheal")
				.setTextureName("protectheal");
		LanguageRegistry.addName(protectheal, "Heal Protect");
		GameRegistry.registerBlock(protectheal, "Heal Protect");
		protectnopvp = new FizzyClubBlock(3024, Material.rock)
				.setStepSound(Block.soundGlassFootstep).setHardness(30.0F)
				.setResistance(30.0F).setLightValue(1.0F)
				.setUnlocalizedName("protectnopvp")
				.setTextureName("protectnopvp");
		LanguageRegistry.addName(protectnopvp, "AntiPVP Protect");
		GameRegistry.registerBlock(protectnopvp, "AntiPVP Protect");

	}

}
