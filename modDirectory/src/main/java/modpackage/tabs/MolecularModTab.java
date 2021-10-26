package modpackage.tabs;

import modpackage.init.ItemInit;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class MolecularModTab extends CreativeTabs{
	public MolecularModTab(String label) {
		super("MolecularModTab");
	}
	public ItemStack getTabIconItem() {
		return new ItemStack(ItemInit.LEAF);
	}
}
