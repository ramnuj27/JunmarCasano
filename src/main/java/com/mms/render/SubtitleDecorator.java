package com.mms.render;

public class SubtitleDecorator extends RendererDecorator {
    public SubtitleDecorator(Renderer wrapped) { super(wrapped); }

    @Override
    public void render(String data) {
        wrapped.render(data);
        System.out.println("[SubtitleDecorator] Displaying subtitles for: " + data);
    }
}
