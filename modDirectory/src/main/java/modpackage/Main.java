package modpackage;

import modpackage.events.ChangeDrop;
import modpackage.gen.StonePopulator;
import modpackage.init.ItemInit;
import modpackage.proxy.CommonProxy;
import modpackage.tabs.MolecularModTab;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MODID, name = Reference.MODNAME, version = Reference.VERSION)
public class Main 
{
	public static final CreativeTabs molecularmodtab =  new MolecularModTab("molecularmodtab");
	
	@Instance
	public static Main instance;
	
	@SidedProxy(clientSide = Reference.CLIENT, serverSide = Reference.SERVER)
	public static CommonProxy proxy;
	
	@EventHandler
	public static void preInit(FMLPreInitializationEvent event) {	
	}
	@EventHandler
	public static void init(FMLInitializationEvent event){
		//MinecraftForge.EVENT_BUS.register(DestroyBlockOnRightClick.class);
		MinecraftForge.EVENT_BUS.register(ChangeDrop.class);
		MinecraftForge.TERRAIN_GEN_BUS.register(new StonePopulator());

	}
	@EventHandler
	public static void postInit(FMLPostInitializationEvent event) {
		ItemInit.ModifyItems();
	}
	
}