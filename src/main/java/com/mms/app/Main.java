package com.mms.app;

import com.mms.controller.PlaybackController;
import com.mms.playlist.*;
import com.mms.render.*;
import com.mms.source.*;
import com.mms.strategy.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Modular Media Streaming Suite ===");

        // Build composite playlist
        Playlist main = new Playlist("Main Playlist");
        main.add(new MediaItem("intro.mp4"));
        main.add(new MediaItem("song.mp3"));

        Playlist sub = new Playlist("Sub Playlist");
        sub.add(new MediaItem("trailer.mov"));
        main.add(sub);

        // Setup rendering strategy and renderer with decorators
        RenderingStrategy sw = new SoftwareRenderingStrategy();
        RenderingStrategy hw = new HardwareRenderingStrategy();

        Renderer baseRenderer = new BasicRenderer(sw);
        Renderer decorated = new SubtitleDecorator(new EqualizerDecorator(new WatermarkDecorator(baseRenderer)));

        // Setup controller
        PlaybackController controller = new PlaybackController(decorated);

        // Use sources (local + remote via proxy)
        MediaSource local = new LocalFileSource("C:/Videos/sample.mp4");
        MediaSource remote = new RemoteProxySource(new HlsStreamSource("https://example.com/stream.m3u8"));

        local.play();
        remote.play(); // first fetch (caches)
        remote.play(); // second fetch (from cache)

        // Play playlist (which triggers media items' play)
        controller.playPlaylist(main);

        // Switch rendering strategy at runtime and render a sample frame
        System.out.println("\n-- Switching to hardware rendering strategy --");
        controller.setStrategy(hw);
        controller.renderFrame("Frame_GPU_001");
    }
}
