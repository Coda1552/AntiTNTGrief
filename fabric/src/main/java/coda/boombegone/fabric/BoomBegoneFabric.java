package coda.boombegone.fabric;

import coda.boombegone.BoomBegone;
import net.fabricmc.api.ModInitializer;

public class BoomBegoneFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        BoomBegone.init();
    }
}
