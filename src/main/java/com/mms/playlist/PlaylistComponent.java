package com.mms.playlist;

public abstract class PlaylistComponent {
    public void add(PlaylistComponent component) { throw new UnsupportedOperationException(); }
    public void remove(PlaylistComponent component) { throw new UnsupportedOperationException(); }
    public abstract void play();
    public abstract String getName();
}
