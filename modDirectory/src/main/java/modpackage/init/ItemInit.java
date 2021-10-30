package modpackage.init;

import java.util.ArrayList;
import java.util.List;

import modpackage.objects.items.ItemBase;
import modpackage.objects.tools.ToolAxe;
import modpackage.objects.tools.ToolKnife;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.common.util.EnumHelper;

public class ItemInit  
{
	//Material 
	public static final ToolMaterial TOOL_CRUDE_STONE = EnumHelper.addToolMaterial("tool_crude_stone", 0, 75, 1.0F, 3.0F, 15);
	public static final ToolMaterial TOOL_HAND_STONE = EnumHelper.addToolMaterial("tool_crude_stone", 0, 25, 1.0F, 2.0F, 15);
	
	public static final List<Item> ITEMS = new ArrayList<Item>();
	
	//Tools
	public static final Item CRUDE_STONE_KNIFE = new ToolKnife("crude_stone_knife", TOOL_CRUDE_STONE);
	public static final Item STONE_KNIFE = new ToolKnife("hand_stone_knife", TOOL_HAND_STONE);
	public static final Item HAND_STONE_AXE = new ToolAxe("hand_stone_axe", TOOL_HAND_STONE);
	
	//Items
	public static final Item CHISEL = new ItemBase("chisel");
	
	
	public static final Item LEAVES = new ItemBase("leaves");
	public static final Item LEAF = new ItemBase("leaf");
	public static final Item GRASS_BLADES = new ItemBase("grass_blades");
	public static final Item GRASS_STRING = new ItemBase("grass_string");
	
	public static void ModifyItems() {
		//CHISEL
		CHISEL.setMaxDamage(10);
		CHISEL.setContainerItem(CHISEL);
		
	}
}