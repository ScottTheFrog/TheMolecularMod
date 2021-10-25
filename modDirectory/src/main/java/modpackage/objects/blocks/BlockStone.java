package modpackage.objects.blocks;

import modpackage.init.BlockInit;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class BlockStone extends BlockBase {

	public static final AxisAlignedBB GROUND_STONE_AABB = new AxisAlignedBB(0.375D,0,0.3125D,0.625D,0.0625D,0.625D);
	
	public BlockStone(String name) {
		super(name, Material.ROCK);
	}

	@Override
	public boolean isOpaqueCube(IBlockState state) {
		return false;
	}
	
	@Override 
	public boolean isFullCube (IBlockState state) {
		return false;
	}
	
	@Override
	public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos) {
		return GROUND_STONE_AABB;
	}
	
	@Override
	public boolean onBlockActivated(World worldIn, BlockPos pos, IBlockState state, EntityPlayer playerIn, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ){	
		if (worldIn.isRemote) {
			return false;
		}
		worldIn.setBlockState(pos, Blocks.AIR.getDefaultState(), 3);  
		playerIn.dropItem(Item.getItemFromBlock(BlockInit.GROUND_STONE), 1);
		return true;
    
    }
} 
