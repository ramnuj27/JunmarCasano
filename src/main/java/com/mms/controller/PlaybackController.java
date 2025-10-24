package com.mms.controller;

import com.mms.playlist.Playlist;
import com.mms.playlist.PlaylistComponent;
import com.mms.render.Renderer;
import com.mms.strategy.RenderingStrategy;

public class PlaybackController {
    private Renderer renderer;

    public PlaybackController(Renderer renderer) {
        this.renderer = renderer;
    }

    public void setStrategy(RenderingStrategy strategy) {
        System.out.println("[PlaybackController] Switching rendering strategy...");
        renderer.setStrategy(strategy);
    }

    public void playPlaylist(Playlist playlist) {
        System.out.println("[PlaybackController] Now playing playlist: " + playlist.getName());
        playlist.play();
    }

    public void playSource(com.mms.source.MediaSource source) {
        System.out.println("[PlaybackController] Playing source: " + source.getDescription());
        String data = source.load();
        renderer.render(data);
    }

    public void renderFrame(String frameId) {
        renderer.render(frameId);
    }
}
