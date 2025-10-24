package com.mms.render;

public class WatermarkDecorator extends RendererDecorator {
    public WatermarkDecorator(Renderer wrapped) { super(wrapped); }

    @Override
    public void render(String data) {
        wrapped.render(data);
        System.out.println("[WatermarkDecorator] Adding watermark to: " + data);
    }
}
