package FizzyClubMods;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBow;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.Mod.Metadata;
import cpw.mods.fml.common.ModMetadata;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import FizzyClubMods.Blocks.FizzyClubBlocks;
import FizzyClubMods.Gui.FizzyClubGuiHandler;
import FizzyClubMods.Gui.packet.FizzyClubPacketHandler;
import FizzyClubMods.Items.FizzyClubArmor;
import FizzyClubMods.Items.FizzyClubItems;
import FizzyClubMods.Proxy.FizzyClubServer;

@Mod(modid = FizzyClubMain.MODID, name = FizzyClubMain.NAME, version = FizzyClubMain.VERSION)

@NetworkMod(clientSideRequired = true,
serverSideRequired = true,
channels = "FizzyClubMods",
packetHandler = FizzyClubPacketHandler.class
)

public class FizzyClubMain {
	
	@Metadata
	public static ModMetadata meta;
	
	@Instance (FizzyClubMain.MODID)

	public static FizzyClubMain instance;

	@SidedProxy(clientSide = "FizzyClubMods.FizzyClubClientProxy", serverSide = "FizzyClubMods.FizzyClubServerProxy")
	
	public static FizzyClubServerProxy proxy;
	
	public static final String MODID = "FizzyClubModsMain";
	public static final String NAME = "FizzyClubModsMain";
	public static final String VERSION = "1.6.4";
	
	//public static CreativeTabs fizzyclubtabsmain;

	@EventHandler
	public void init(FMLInitializationEvent Event)
	{
		
	}

	@EventHandler
	public void PreLoad(FMLPreInitializationEvent PreEvent)
	{
		
	}
	
	@EventHandler
	public void load(FMLInitializationEvent Event)
	{
		proxy.init();
	    proxy.renderPlayer();
	    proxy.registerKeyhandler();
		NetworkRegistry.instance().registerGuiHandler(instance, new FizzyClubGuiHandler());
		FizzyClubArmor.registerWing();
		FizzyClubArmor.registerBuff();
		FizzyClubItems.init();
		FizzyClubBlocks.init();
		/*
		// CreativeTabs

		fizzyclubtabsmain = new FizzyClubTabs(CreativeTabs.getNextID(), "fizzyclubtabsmain");
		LanguageRegistry.instance().addStringLocalization("itemGroup.fizzyclubtabsmain", "FizzyClubMods");
		*/
	}
	
	@EventHandler
	public void PostLoad(FMLPostInitializationEvent PostEvent)
	{
		
	}

}
