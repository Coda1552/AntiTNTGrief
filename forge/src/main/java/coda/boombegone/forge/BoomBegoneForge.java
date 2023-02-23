package coda.boombegone.forge;

import coda.boombegone.BoomBegone;
import net.minecraft.world.entity.decoration.ArmorStand;
import net.minecraft.world.entity.decoration.HangingEntity;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.level.ExplosionEvent;
import net.minecraftforge.fml.common.Mod;

@Mod(BoomBegone.MOD_ID)
public class BoomBegoneForge {
    public BoomBegoneForge() {
        MinecraftForge.EVENT_BUS.addListener(BoomBegoneForge::onExplode);
    }

    private static void onExplode(ExplosionEvent.Detonate event) {
        event.getAffectedBlocks().clear();
        event.getAffectedEntities().removeIf(entity -> entity instanceof HangingEntity || entity instanceof ArmorStand);
    }
}
