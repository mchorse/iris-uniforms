package mchorse.iris_uniforms.mixin.client;

import net.irisshaders.iris.gui.element.widget.StringElementWidget;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Invoker;

@Mixin(StringElementWidget.class)
public interface StringElementWidgetInvoker
{
    @Invoker(value = "queue", remap = false)
    public void bbs$queue();
}