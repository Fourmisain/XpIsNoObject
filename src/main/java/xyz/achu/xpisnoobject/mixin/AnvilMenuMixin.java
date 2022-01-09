package xyz.achu.xpisnoobject.mixin;

import net.minecraft.world.inventory.AnvilMenu;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.Constant;
import org.spongepowered.asm.mixin.injection.ModifyConstant;
import org.spongepowered.asm.mixin.injection.ModifyVariable;

@Mixin(AnvilMenu.class)
public class AnvilMenuMixin {
    @ModifyConstant(method = "createResult", constant = @Constant(intValue = 40))
    private int customLimitInt(int i) {
        return 99999;
    }

    @ModifyConstant(method = "createResult", constant = @Constant(intValue = 39))
    private int customMaxInt(int i) {
        return 99999 - 1;
    }
}
