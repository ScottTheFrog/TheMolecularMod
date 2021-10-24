package modpackage.init;

import modpackage.blocks.TranslucentBlock;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod.EventBusSubscriber(modid="tmm")
public class ModBlocks {

	static Block stick_block;
	static Block stick_block_xshape;
	
	public static void init() {
		stick_block = new TranslucentBlock("stick_block", Material.WOOD).setHardness(0.1f).setCreativeTab(MolecularMod);
		stick_block_xshape = new TranslucentBlock("stick_block_xshape", Material.WOOD).setHardness(0.3f).setCreativeTab(MolecularMod);

	}
	
	@SubscribeEvent
	public static void registerBlocks(RegistryEvent.Register<Block> event) {
		event.getRegistry().registerAll(stick_block);
		event.getRegistry().registerAll(stick_block_xshape);
	}
	
	@SubscribeEvent
	public static void registerItemBlocks(RegistryEvent.Register<Item> event) {
		event.getRegistry().registerAll(new ItemBlock(stick_block).setRegistryName(stick_block.getRegistryName()));
		event.getRegistry().registerAll(new ItemBlock(stick_block_xshape).setRegistryName(stick_block_xshape.getRegistryName()));
	}
	
	@SubscribeEvent
	public static void registerRenders(ModelRegistryEvent event) {
		registerRender(Item.getItemFromBlock(stick_block));
		registerRender(Item.getItemFromBlock(stick_block_xshape));
	}
	
	public static void registerRender(Item item) {
		  ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation( item.getRegistryName(), "inventory"));
		}
	
	static final CreativeTabs MolecularMod = (new CreativeTabs("MolecularMod") {

		@Override
		public ItemStack getTabIconItem() {
			return new ItemStack(stick_block_xshape);
		}
		
	});
}