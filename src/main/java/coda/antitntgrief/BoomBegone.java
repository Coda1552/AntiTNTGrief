package coda.antitntgrief;

import net.minecraft.core.BlockPos;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.world.ExplosionEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;

import java.util.List;

@Mod(BoomBegone.MOD_ID)
public class BoomBegone {
    public static final String MOD_ID = "boombegone";

    public BoomBegone() {
        IEventBus forgeBus = MinecraftForge.EVENT_BUS;

        forgeBus.addListener(this::explode);
    }

    private void explode(ExplosionEvent.Detonate event) {
        List<BlockPos> blocks = event.getAffectedBlocks();
        blocks.clear();
    }
}

