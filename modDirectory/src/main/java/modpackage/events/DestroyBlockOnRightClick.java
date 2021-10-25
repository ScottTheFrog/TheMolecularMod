package modpackage.events;

import modpackage.init.BlockInit;
import net.minecraft.init.Blocks;
import net.minecraft.util.EnumActionResult;
import net.minecraft.world.World;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class DestroyBlockOnRightClick {
	  @SubscribeEvent
	  public EnumActionResult onInteract(PlayerInteractEvent.RightClickBlock event) {
		  World world = event.getWorld();
		  System.out.println("Doesn't destroy yet"); 
	      if(world.getBlockState(event.getPos()).getBlock() == BlockInit.GROUND_STONE) {
	    	  System.out.println("Doesn't destroy yet rock "); 
	    	  world.setBlockState(event.getPos(), Blocks.AIR.getDefaultState(), 3);      
	      }
	      return EnumActionResult.SUCCESS;
	  }
}
