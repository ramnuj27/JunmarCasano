package com.mms.render;

import com.mms.strategy.RenderingStrategy;

public class BasicRenderer implements Renderer {
    private RenderingStrategy strategy;

    public BasicRenderer(RenderingStrategy strategy) {
        this.strategy = strategy;
    }

    @Override
    public void render(String data) {
        if (data == null) data = "<empty>";
        strategy.render(data);
    }

    @Override
    public void setStrategy(RenderingStrategy strategy) {
        this.strategy = strategy;
    }
}
