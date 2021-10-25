package modpackage.gen;

import java.util.Random;

import modpackage.init.BlockInit;
import net.minecraft.block.material.Material;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;

public class GroundStoneGenerator extends WorldGenerator {
	
	@Override
	public boolean generate(World worldIn, Random rand, BlockPos position) {
		for (int i = 0; i < 64; ++i) {
			BlockPos blockpos = position.add(rand.nextInt(16), rand.nextInt(4) - rand.nextInt(4), rand.nextInt(16));
			if (worldIn.isAirBlock(blockpos) && (!worldIn.provider.isNether() || blockpos.getY() < 255)){
				if 
					(worldIn.getBlockState(blockpos.down()).getMaterial() == Material.GROUND ||
					 worldIn.getBlockState(blockpos.down()).getMaterial() == Material.GRASS ||
					 worldIn.getBlockState(blockpos.down()).getMaterial() == Material.SAND ||
					 worldIn.getBlockState(blockpos.down()).getMaterial() == Material.ROCK){
						worldIn.setBlockState(blockpos, BlockInit.GROUND_STONE.getDefaultState(), 2);
					}
			}
		}
		return true;
	}
}
