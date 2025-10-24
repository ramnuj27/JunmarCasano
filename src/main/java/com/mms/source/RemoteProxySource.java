package com.mms.source;

public class RemoteProxySource implements MediaSource {
    private final MediaSource real;
    private String cache;

    public RemoteProxySource(MediaSource real) { this.real = real; }

    @Override
    public String load() {
        if (cache == null) {
            System.out.println("[RemoteProxySource] Cache miss, loading from real source...");
            cache = real.load();
        } else {
            System.out.println("[RemoteProxySource] Cache hit, returning cached data");
        }
        return cache;
    }

    @Override
    public String getDescription() { return "Remote Proxy"; }

    @Override
    public void play() {
        load();
        System.out.println("[RemoteProxySource] Playing cached/remote stream...");
    }
}
