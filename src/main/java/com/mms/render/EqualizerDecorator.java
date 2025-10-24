package com.mms.render;

public class EqualizerDecorator extends RendererDecorator {
    public EqualizerDecorator(Renderer wrapped) { super(wrapped); }

    @Override
    public void render(String data) {
        wrapped.render(data);
        System.out.println("[EqualizerDecorator] Adjusting audio EQ for: " + data);
    }
}
