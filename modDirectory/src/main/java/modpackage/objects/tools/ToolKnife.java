package modpackage.objects.tools;

import java.util.Set;

import com.google.common.collect.Sets;

import modpackage.Main;
import modpackage.init.ItemInit;
import modpackage.util.IHasModel;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemTool;


public class ToolKnife extends ItemTool implements IHasModel{
	
	public static final Set<Block> EFFECTIVE_ON = Sets.newHashSet(Blocks.GRASS,Blocks.LEAVES,Blocks.SNOW);
	
	public ToolKnife(String name, ToolMaterial material) {
		super(material, EFFECTIVE_ON);
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
