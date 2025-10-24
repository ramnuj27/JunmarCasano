package com.mms.playlist;

public class MediaItem extends PlaylistComponent {
    private final String name;

    public MediaItem(String name) { this.name = name; }

    @Override
    public void play() {
        System.out.println("[MediaItem] Playing media item: " + name);
    }

    @Override
    public String getName() { return name; }
}
