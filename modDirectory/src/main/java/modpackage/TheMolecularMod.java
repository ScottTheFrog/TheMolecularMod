package modpackage;

import modpackage.init.ModBlocks;
import modpackage.init.ModItems;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid=reference.MODID,
name=reference.MODNAME,
version=reference.VERSION,
acceptedMinecraftVersions=reference.ACCEPTED_MINECRAFT_VERSIONS)

public class TheMolecularMod {
	@Instance
	public static TheMolecularMod instance;

	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		System.out.println(reference.MODID + ":preInit");
		ModItems.init();
		ModBlocks.init();
	}
	
	@EventHandler
	public void init(FMLInitializationEvent event) {
		System.out.println(reference.MODID + ":init");
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {
		System.out.println(reference.MODID + ":postInit");
	}
}
