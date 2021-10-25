package modpackage.init;

import java.util.ArrayList;
import java.util.List;

import modpackage.objects.items.ItemBase;
import net.minecraft.item.Item;

public class ItemInit  
{
	public static final List<Item> ITEMS = new ArrayList<Item>();
	//Items
	public static final Item LEAVES = new ItemBase("leaves");
	public static final Item LEAF = new ItemBase("leaf");
}