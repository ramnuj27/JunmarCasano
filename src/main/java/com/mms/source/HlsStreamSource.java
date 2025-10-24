package com.mms.source;

public class HlsStreamSource implements MediaSource {
    private final String url;

    public HlsStreamSource(String url) { this.url = url; }

    @Override
    public String load() {
        String msg = "Streaming HLS from: " + url;
        System.out.println("[HlsStreamSource] " + msg);
        return msg;
    }

    @Override
    public String getDescription() { return "HLS Stream"; }

    @Override
    public void play() {
        load();
        System.out.println("[HlsStreamSource] Playing HLS stream: " + url);
    }
}
