package modpackage.init;

import java.util.ArrayList;
import java.util.List;

import modpackage.objects.blocks.BlockBase;
import modpackage.objects.blocks.BlockStone;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockInit {

	public static final List<Block> BLOCKS = new ArrayList<Block>();
	//Blocks
	public static final Block LEAVES_BUSH = new BlockBase("leaves_bush", Material.LEAVES);
	
	
	//Custom Model Blocks
	public static final Block GROUND_STONE = new BlockStone("ground_stone").setHardness(-1);
	}