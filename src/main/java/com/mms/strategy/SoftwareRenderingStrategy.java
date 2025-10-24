package com.mms.strategy;

public class SoftwareRenderingStrategy implements RenderingStrategy {
    @Override
    public void render(String data) {
        System.out.println("[SoftwareRendering] CPU rendering: " + data);
    }
}
