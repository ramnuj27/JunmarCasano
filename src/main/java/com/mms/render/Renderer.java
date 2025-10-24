package com.mms.render;

import com.mms.strategy.RenderingStrategy;

public interface Renderer {
    void render(String data);
    void setStrategy(RenderingStrategy strategy);
}
