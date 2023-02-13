package coda.boombegone.mixin;

import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.decoration.ArmorStand;
import net.minecraft.world.entity.decoration.HangingEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin({HangingEntity.class, ArmorStand.class})
public class ExplosionEntityMixin {

    @Inject(method = "hurt", at = @At("HEAD"), cancellable = true)
    private void boombegone$hurt(DamageSource source, float amount, CallbackInfoReturnable<Boolean> cir) {
        if (source.isExplosion()) {
            cir.setReturnValue(false);
        }
    }
}
