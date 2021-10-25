package modpackage.gen;

import java.util.Random;

import net.minecraft.init.Biomes;
import net.minecraft.world.World;
import net.minecraft.world.biome.Biome;
import net.minecraftforge.event.terraingen.DecorateBiomeEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class StonePopulator {
	@SubscribeEvent
	public void decorate(DecorateBiomeEvent.Decorate event) {
		World world = event.getWorld();
		Biome biome = world.getBiomeForCoordsBody(event.getPos());
		Random rand = event.getRand();
		if (event.getType() == DecorateBiomeEvent.Decorate.EventType.GRASS) {
			if (rand.nextDouble() > 0.1) return;
			int x = rand.nextInt(16) + 8;
			int y = rand.nextInt(16) + 8;
			GroundStoneGenerator gen = new GroundStoneGenerator ();
			gen.generate(world, rand, world.getHeight(event.getPos().add(x, 0, y)));
		}
	}
}

