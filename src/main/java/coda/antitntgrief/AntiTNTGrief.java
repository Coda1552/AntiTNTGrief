package coda.antitntgrief;

import net.minecraft.core.BlockPos;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.world.ExplosionEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

import java.util.List;

@Mod(AntiTNTGrief.MOD_ID)
public class AntiTNTGrief {
    public static final String MOD_ID = "antitntgrief";

    public AntiTNTGrief() {
        IEventBus forgeBus = MinecraftForge.EVENT_BUS;

        forgeBus.addListener(this::explode);
    }

    private void explode(ExplosionEvent.Detonate event) {
        List<BlockPos> blocks = event.getAffectedBlocks();

        for (BlockPos pos : blocks) {
            blocks.remove(pos);
        }
    }

}
