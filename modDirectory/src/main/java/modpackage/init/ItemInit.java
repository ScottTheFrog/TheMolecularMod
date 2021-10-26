package modpackage.init;

import java.util.ArrayList;
import java.util.List;

import modpackage.objects.items.ItemBase;
import modpackage.objects.tools.ToolKnife;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.common.util.EnumHelper;

public class ItemInit  
{
	//Material 
	public static final ToolMaterial TOOL_CRUDE_STONE = EnumHelper.addToolMaterial("tool_crude_stone", 0, 75, 1.0F, 5.0F, 15);
	
	public static final List<Item> ITEMS = new ArrayList<Item>();
	
	//Tools
	public static final Item CRUDE_STONE_KNIFE = new ToolKnife("crude_stone_knife", TOOL_CRUDE_STONE);
	
	//Items
	public static final Item LEAVES = new ItemBase("leaves");
	public static final Item LEAF = new ItemBase("leaf");
}