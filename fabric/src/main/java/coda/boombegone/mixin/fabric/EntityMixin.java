package coda.boombegone.mixin.fabric;

import net.minecraft.world.entity.decoration.ArmorStand;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(ArmorStand.class)
public class EntityMixin {
    @Inject(method = "ignoreExplosion", at = @At("HEAD"), cancellable = true)
    private void boombegone$ignoreExplosion(CallbackInfoReturnable<Boolean> cir) {
        cir.setReturnValue(true);
    }
}
