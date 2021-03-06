package modpackage.objects.items;


import modpackage.Main;
import modpackage.init.ItemInit;
import modpackage.util.IHasModel;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;


public class ItemBase extends Item implements IHasModel{
	
	public ItemBase(String name) {
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(Main.molecularmodtab);
		
		ItemInit.ITEMS.add(this);
		
	}
	@Override
	public void registerModels() {
		Main.proxy.registerItemRenderer(this, 0, "inventory");
	}

}
