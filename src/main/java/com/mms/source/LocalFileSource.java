package com.mms.source;

public class LocalFileSource implements MediaSource {
    private final String path;

    public LocalFileSource(String path) { this.path = path; }

    @Override
    public String load() {
        String msg = "Loaded from local file: " + path;
        System.out.println("[LocalFileSource] " + msg);
        return msg;
    }

    @Override
    public String getDescription() { return "Local File"; }

    @Override
    public void play() {
        load();
        System.out.println("[LocalFileSource] Playing local file: " + path);
    }
}
