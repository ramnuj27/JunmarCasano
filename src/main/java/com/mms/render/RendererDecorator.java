package com.mms.render;

import com.mms.strategy.RenderingStrategy;

public abstract class RendererDecorator implements Renderer {
    protected final Renderer wrapped;

    public RendererDecorator(Renderer wrapped) { this.wrapped = wrapped; }

    @Override
    public void setStrategy(RenderingStrategy strategy) {
        wrapped.setStrategy(strategy);
    }
}
