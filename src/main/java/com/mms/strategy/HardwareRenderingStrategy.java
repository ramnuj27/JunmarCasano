package com.mms.strategy;

public class HardwareRenderingStrategy implements RenderingStrategy {
    @Override
    public void render(String data) {
        System.out.println("[HardwareRendering] GPU rendering: " + data);
    }
}
