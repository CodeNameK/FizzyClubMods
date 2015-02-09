package FizzyClubMods.Items;

import FizzyClubMods.EmeraldArmor;
import FizzyClubMods.EmeraldAxe;
import FizzyClubMods.EmeraldHoe;
import FizzyClubMods.EmeraldPickaxe;
import FizzyClubMods.EmeraldShovel;
import FizzyClubMods.EmeraldSword;
import FizzyClubMods.FizzyClubBow;
import FizzyClubMods.FizzyClubEnumBase;
import FizzyClubMods.FizzyClubItem;
import FizzyClubMods.Quest.KingArmor;
import FizzyClubMods.Quest.QueenSword;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBow;
import net.minecraft.item.ItemStack;

public class FizzyClubItems {

	public static Item fizzyclubcoin5;
	public static Item fizzyclubcoin10;
	public static Item fizzyclubcoin100;
	public static Item fizzyclubcoin1000;
	public static Item fizzyclubcoin10000;

	public static Item dragonheart;
	public static Item dungeonmap;
	public static Item ginseng;
	public static Item piranha;
	public static Item skull1;
	public static Item skull2;
	public static Item skull3;
	public static Item stone1;
	public static Item stone2;
	public static Item stone3;
	public static Item stone4;
	public static Item stone5;

	public static Item emeraldhelmet;
	public static Item emeraldchestplate;
	public static Item emeraldlegging;
	public static Item emeraldboot;
	public static Item emeraldsword;
	public static Item emeraldpickaxe;
	public static Item emeraldaxe;
	public static Item emeraldshovel;
	public static Item emeraldhoe;

	public static Item upgradestoneweapon;
	public static Item upgradestonearmor;
	public static Item repairstone;

	public static Item talisman20;
	public static Item talisman15;
	public static Item talisman10;
	public static Item talisman5;

	public static ItemBow viperbow;
	public static ItemBow frozenbow;
	public static ItemBow healbow;
	
	public static Item fizzyclubmods;
	
	public static Item king;
	public static Item kinghelmet;
	public static Item kingchestplate;
	public static Item kinglegging;
	public static Item kingboot;
	
	public static Item queensword;
	

	public static void init() {

		addCraft();
		addItem();
		addBow();
		addArmor();

	}

	private static void addArmor() {
		
		kinghelmet = new KingArmor(5514, FizzyClubEnumBase.kingArmors, 0, 0).setUnlocalizedName("kinghelmet").setTextureName("kinghelmet");
		LanguageRegistry.addName(kinghelmet, "king Helmet");
		GameRegistry.registerItem(kinghelmet, "king Helmet");
		kingchestplate = new KingArmor(5515, FizzyClubEnumBase.kingArmors, 0, 1).setUnlocalizedName("kingchestplate").setTextureName("kingchestplate");
		LanguageRegistry.addName(kingchestplate, "king ChestPlate");
		GameRegistry.registerItem(kingchestplate, "king ChestPlate");
		kinglegging = new KingArmor(5516, FizzyClubEnumBase.kingArmors, 0, 2).setUnlocalizedName("kinglegging").setTextureName("kinglegging");
		LanguageRegistry.addName(kinglegging, "king Legging");
		GameRegistry.registerItem(kinglegging, "king Legging");
		kingboot = new KingArmor(5517, FizzyClubEnumBase.kingArmors, 0, 3).setUnlocalizedName("kingboot").setTextureName("kingboot");
		LanguageRegistry.addName(kingboot, "king Boot");
		GameRegistry.registerItem(kingboot, "king Boot");
		
		// Set Queen Sword 
		
		queensword = (new QueenSword(5518, FizzyClubEnumBase.QueenSwords)).setUnlocalizedName("queensword").setTextureName("queensword");
		LanguageRegistry.addName(queensword, "king Sword");
		GameRegistry.registerItem(queensword, "king Sword");
		
	}

	private static void addBow() {

		// Set Bow

		viperbow = (ItemBow) new FizzyClubBow(3025).setUnlocalizedName(
				"viperbow").setTextureName("viperbow");
		LanguageRegistry.addName(viperbow, "Viper Bow");
		GameRegistry.registerItem(viperbow, "Viper Bow");
		frozenbow = (ItemBow) new FizzyClubBow(3026).setUnlocalizedName(
				"frozenbow").setTextureName("frozenbow");
		LanguageRegistry.addName(frozenbow, "Frozen Bow");
		GameRegistry.registerItem(frozenbow, "Frozen Bow");
		healbow = (ItemBow) new FizzyClubBow(3027)
				.setUnlocalizedName("healbow").setTextureName("healbow");
		LanguageRegistry.addName(healbow, "Heal Bow");
		GameRegistry.registerItem(healbow, "Heal Bow");

	}

	private static void addItem() {

		// Set Coin

		fizzyclubcoin5 = new FizzyClubItem(3028).setUnlocalizedName(
				"fizzyclubcoin5").setTextureName("fizzyclubcoin5");
		LanguageRegistry.addName(fizzyclubcoin5, "5 Silver");
		GameRegistry.registerItem(fizzyclubcoin5, "5 Silver");
		fizzyclubcoin10 = new FizzyClubItem(3029).setUnlocalizedName(
				"fizzyclubcoin10").setTextureName("fizzyclubcoin10");
		LanguageRegistry.addName(fizzyclubcoin10, "10 Silver");
		GameRegistry.registerItem(fizzyclubcoin10, "10 Silver");
		fizzyclubcoin100 = new FizzyClubItem(3030).setUnlocalizedName(
				"fizzyclubcoin100").setTextureName("fizzyclubcoin100");
		LanguageRegistry.addName(fizzyclubcoin100, "100 Silver");
		GameRegistry.registerItem(fizzyclubcoin100, "100 Silver");
		fizzyclubcoin1000 = new FizzyClubItem(3031).setUnlocalizedName(
				"fizzyclubcoin1000").setTextureName("fizzyclubcoin1000");
		LanguageRegistry.addName(fizzyclubcoin1000, "1000 Silver");
		GameRegistry.registerItem(fizzyclubcoin1000, "1000 Silver");
		fizzyclubcoin10000 = new FizzyClubItem(3032).setUnlocalizedName(
				"fizzyclubcoin10000").setTextureName("fizzyclubcoin10000");
		LanguageRegistry.addName(fizzyclubcoin10000, "10000 Silver");
		GameRegistry.registerItem(fizzyclubcoin10000, "10000 Silver");

		// Set NPC

		dragonheart = new FizzyClubItem(3033).setUnlocalizedName("dragonheart")
				.setTextureName("dragonheart");
		LanguageRegistry.addName(dragonheart, "Dragon Heart");
		GameRegistry.registerItem(dragonheart, "Dragon Heart");
		dungeonmap = new FizzyClubItem(3034).setUnlocalizedName("dungeonmap")
				.setTextureName("dungeonmap");
		LanguageRegistry.addName(dungeonmap, "Dungeon Map");
		GameRegistry.registerItem(dungeonmap, "Dungeon Map");
		ginseng = new FizzyClubItem(3035).setUnlocalizedName("ginseng")
				.setTextureName("ginseng");
		LanguageRegistry.addName(ginseng, "Ginseng");
		GameRegistry.registerItem(ginseng, "Ginseng");
		piranha = new FizzyClubItem(3036).setUnlocalizedName("piranha")
				.setTextureName("piranha");
		LanguageRegistry.addName(piranha, "Piranha");
		GameRegistry.registerItem(piranha, "Piranha");
		skull1 = new FizzyClubItem(3037).setUnlocalizedName("skull1")
				.setTextureName("skull1");
		LanguageRegistry.addName(skull1, "Skull 1");
		GameRegistry.registerItem(skull1, "Skull 1");
		skull2 = new FizzyClubItem(3038).setUnlocalizedName("skull2")
				.setTextureName("skull2");
		LanguageRegistry.addName(skull2, "Skull 2");
		GameRegistry.registerItem(skull2, "Skull 2");
		skull3 = new FizzyClubItem(3039).setUnlocalizedName("skull3")
				.setTextureName("skull3");
		LanguageRegistry.addName(skull3, "Skull 3");
		GameRegistry.registerItem(skull3, "Skull 3");
		stone1 = new FizzyClubItem(3040).setUnlocalizedName("stone1")
				.setTextureName("stone1");
		LanguageRegistry.addName(stone1, "Stone 1");
		GameRegistry.registerItem(stone1, "Stone 1");
		stone2 = new FizzyClubItem(3041).setUnlocalizedName("stone2")
				.setTextureName("stone2");
		LanguageRegistry.addName(stone2, "Stone 2");
		GameRegistry.registerItem(stone2, "Stone 2");
		stone3 = new FizzyClubItem(3042).setUnlocalizedName("stone3")
				.setTextureName("stone3");
		LanguageRegistry.addName(stone3, "Stone 3");
		GameRegistry.registerItem(stone3, "Stone 3");
		stone4 = new FizzyClubItem(3043).setUnlocalizedName("stone4")
				.setTextureName("stone4");
		LanguageRegistry.addName(stone4, "Stone 4");
		GameRegistry.registerItem(stone4, "Stone 4");
		stone5 = new FizzyClubItem(3044).setUnlocalizedName("stone5")
				.setTextureName("stone5");
		LanguageRegistry.addName(stone5, "Stone 5");
		GameRegistry.registerItem(stone5, "Stone 5");
		
		// IconTabs
		
		fizzyclubmods = new FizzyClubItem(2999).setUnlocalizedName("logo").setTextureName("logo");
		LanguageRegistry.addName(fizzyclubmods, "Welcome To Minecraft FizzyClub");
		GameRegistry.registerItem(fizzyclubmods, "Welcome To Minecraft FizzyClub");
	}

	private static void addCraft() {

		emeraldhelmet = new EmeraldArmor(3000, FizzyClubEnumBase.EmeraldArmors,
				0, 0).setUnlocalizedName("emeraldhelmet").setTextureName(
				"emeraldhelmet");
		LanguageRegistry.addName(emeraldhelmet, "Emerald Helmet");
		GameRegistry.registerItem(emeraldhelmet, "Emerald Helmet");
		GameRegistry.addRecipe(new ItemStack(emeraldhelmet, 1), new Object[] {
				"   ", "XXX", "X X", 'X', Item.emerald });
		emeraldchestplate = new EmeraldArmor(3001,
				FizzyClubEnumBase.EmeraldArmors, 0, 1).setUnlocalizedName(
				"emeraldchestplate").setTextureName("emeraldchestplate");
		LanguageRegistry.addName(emeraldchestplate, "Emerald ChestPlate");
		GameRegistry.registerItem(emeraldchestplate, "Emerald ChestPlate");
		GameRegistry.addRecipe(new ItemStack(emeraldchestplate, 1),
				new Object[] { "X X", "XXX", "XXX", 'X', Item.emerald });
		emeraldlegging = new EmeraldArmor(3002,
				FizzyClubEnumBase.EmeraldArmors, 0, 2).setUnlocalizedName(
				"emeraldlegging").setTextureName("emeraldlegging");
		LanguageRegistry.addName(emeraldlegging, "Emerald Legging");
		GameRegistry.registerItem(emeraldlegging, "Emerald Legging");
		GameRegistry.addRecipe(new ItemStack(emeraldlegging, 1), new Object[] {
				"XXX", "X X", "X X", 'X', Item.emerald });
		emeraldboot = new EmeraldArmor(3004, FizzyClubEnumBase.EmeraldArmors,
				0, 3).setUnlocalizedName("emeraldboot").setTextureName(
				"emeraldboot");
		LanguageRegistry.addName(emeraldboot, "Emerald Boot");
		GameRegistry.registerItem(emeraldboot, "Emerald Boot");
		GameRegistry.addRecipe(new ItemStack(emeraldboot, 1), new Object[] {
				"   ", "X X", "X X", 'X', Item.emerald });
		emeraldsword = (new EmeraldSword(3005, FizzyClubEnumBase.EmeraldTools))
				.setUnlocalizedName("emeraldsword").setTextureName(
						"emeraldsword");
		LanguageRegistry.addName(emeraldsword, "Emerald Sword");
		GameRegistry.registerItem(emeraldsword, "Emerald Sword");
		GameRegistry.addRecipe(new ItemStack(emeraldsword, 1), new Object[] {
				" Z ", "ZZZ", " X ", 'X', Item.stick, 'Z', Item.emerald });
		emeraldpickaxe = (new EmeraldPickaxe(3006,
				FizzyClubEnumBase.EmeraldTools)).setUnlocalizedName(
				"emeraldpickaxe").setTextureName("emeraldpickaxe");
		LanguageRegistry.addName(emeraldpickaxe, "Emerald PickAxe");
		GameRegistry.registerItem(emeraldpickaxe, "Emerald PickAxe");
		GameRegistry.addRecipe(new ItemStack(emeraldpickaxe, 1), new Object[] {
				"ZZZ", " X ", " X ", 'X', Item.stick, 'Z', Item.emerald });
		emeraldaxe = (new EmeraldAxe(3007, FizzyClubEnumBase.EmeraldTools))
				.setUnlocalizedName("emeraldaxe").setTextureName("emeraldaxe");
		LanguageRegistry.addName(emeraldaxe, "Emerald Axe");
		GameRegistry.registerItem(emeraldaxe, "Emerald Axe");
		GameRegistry.addRecipe(new ItemStack(emeraldaxe, 1), new Object[] {
				"ZZ ", "ZX ", " X ", 'X', Item.stick, 'Z', Item.emerald });
		emeraldshovel = (new EmeraldShovel(3008, FizzyClubEnumBase.EmeraldTools))
				.setUnlocalizedName("emeraldshovel").setTextureName(
						"emeraldshovel");
		LanguageRegistry.addName(emeraldshovel, "Emerald Shovel");
		GameRegistry.registerItem(emeraldshovel, "Emerald Shovel");
		GameRegistry.addRecipe(new ItemStack(emeraldshovel, 1), new Object[] {
				"ZZ ", " X ", " X ", 'X', Item.stick, 'Z', Item.emerald });
		emeraldhoe = (new EmeraldHoe(3009, FizzyClubEnumBase.EmeraldTools))
				.setUnlocalizedName("emeraldhoe").setTextureName("emeraldhoe");
		LanguageRegistry.addName(emeraldhoe, "Emerald Hoe");
		GameRegistry.registerItem(emeraldhoe, "Emerald Hoe");
		GameRegistry.addRecipe(new ItemStack(emeraldhoe, 1), new Object[] {
				" Z ", " X ", " X ", 'X', Item.stick, 'Z', Item.emerald });

		// Set Stone

		upgradestoneweapon = new FizzyClubItem(3010).setUnlocalizedName(
				"upgradestoneweapon").setTextureName("upgradestoneweapon");
		LanguageRegistry.addName(upgradestoneweapon, "Upgrade Stone (Weapon)");
		GameRegistry.registerItem(upgradestoneweapon, "Upgrade Stone (Weapon)");
		upgradestonearmor = new FizzyClubItem(3011).setUnlocalizedName(
				"upgradestonearmor").setTextureName("upgradestonearmor");
		LanguageRegistry.addName(upgradestonearmor, "Upgrade Stone (Armor)");
		GameRegistry.registerItem(upgradestonearmor, "Upgrade Stone (Armor)");
		repairstone = new FizzyClubItem(3012).setUnlocalizedName("repairstone")
				.setTextureName("repairstone");
		LanguageRegistry.addName(repairstone, "Repair Stone");
		GameRegistry.registerItem(repairstone, "Repair Stone");

		// Set Talisman

		talisman5 = new FizzyClubItem(3013).setUnlocalizedName("talisman5")
				.setTextureName("talisman5");
		LanguageRegistry.addName(talisman5, "5% Fortune Talisman");
		GameRegistry.registerItem(talisman5, "5% Fortune Talisman");
		talisman10 = new FizzyClubItem(3014).setUnlocalizedName("talisman10")
				.setTextureName("talisman10");
		LanguageRegistry.addName(talisman10, "10% Fortune Talisman");
		GameRegistry.registerItem(talisman10, "10% Fortune Talisman");
		talisman15 = new FizzyClubItem(3015).setUnlocalizedName("talisman15")
				.setTextureName("talisman15");
		LanguageRegistry.addName(talisman15, "15% Fortune Talisman");
		GameRegistry.registerItem(talisman15, "15% Fortune Talisman");
		talisman20 = new FizzyClubItem(3016).setUnlocalizedName("talisman20")
				.setTextureName("talisman20");
		LanguageRegistry.addName(talisman20, "20% Fortune Talisman");
		GameRegistry.registerItem(talisman20, "20% Fortune Talisman");

	}

}
