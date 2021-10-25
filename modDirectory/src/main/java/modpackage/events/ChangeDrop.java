package modpackage.events;

import java.util.Random;

import modpackage.init.ItemInit;
import net.minecraft.block.BlockLeaves;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.world.BlockEvent.HarvestDropsEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class ChangeDrop {


    @SubscribeEvent
    public static void DropLeaf(HarvestDropsEvent event)
    {
       Random rand = new Random();
        if(event.getState().getBlock() instanceof BlockLeaves)
        {
            event.getDrops().add(new ItemStack(ItemInit.LEAF,1 + rand.nextInt(3)));
        }
    }

}
