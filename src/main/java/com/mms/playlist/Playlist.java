package com.mms.playlist;

import java.util.ArrayList;
import java.util.List;

public class Playlist extends PlaylistComponent {
    private final String name;
    private final List<PlaylistComponent> items = new ArrayList<>();

    public Playlist(String name) { this.name = name; }

    @Override
    public void add(PlaylistComponent component) { items.add(component); }

    @Override
    public void play() {
        System.out.println("== Playlist: " + name + " ==");
        for (PlaylistComponent item : items) item.play();
    }

    @Override
    public String getName() { return name; }
}
