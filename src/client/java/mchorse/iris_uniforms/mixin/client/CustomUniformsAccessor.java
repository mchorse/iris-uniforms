package mchorse.iris_uniforms.mixin.client;

import net.irisshaders.iris.uniforms.custom.CustomUniforms;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

import java.util.List;

@Mixin(CustomUniforms.class)
public interface CustomUniformsAccessor
{
    @Accessor(value = "uniformOrder", remap = false)
    public List bbs$uniformOrder();
}