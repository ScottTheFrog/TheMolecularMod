package modpackage.events;

import java.util.Random;

import modpackage.init.ItemInit;
import modpackage.objects.tools.ToolKnife;
import net.minecraft.block.BlockTallGrass;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.world.BlockEvent.HarvestDropsEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class ChangeDrop {

	/*
	@SubscribeEvent
    public static void DropLeaf(HarvestDropsEvent event)
    {
       Random rand = new Random();
        if(event.getState().getBlock() instanceof BlockLeaves)
        {
            event.getDrops().add(new ItemStack(Items.STICK,rand.nextInt(2)));
        }
    }*/
	@SubscribeEvent
    public static void KnifeHarvest(HarvestDropsEvent event)
    {
    Random rand = new Random();
       EntityPlayer breaker = event.getHarvester();
       if (breaker != null) {
    	   System.out.println("fired1");
    	   ItemStack heldStack = breaker.getHeldItemMainhand();
    	   Item item_held = heldStack.getItem();
	       if(!breaker.world.isRemote) {
		       if(event.getState().getBlock() instanceof BlockTallGrass 
		    		   && item_held.getClass() == ToolKnife.class)
			        {
		    	   System.out.println("fired2");
		    	   		ItemStack stack = new ItemStack(ItemInit.GRASS_BLADES);
			    	    EntityItem currentItem = new EntityItem(breaker.world,
			    	    		event.getPos().getX()+0.5,
			    	    		event.getPos().getY()+0.5,
			    	    		event.getPos().getZ()+0.5,
			    	    		stack);
			    	    breaker.world.spawnEntity(currentItem);
			        }
	       }
	    }
    }
}
