package com.mms.source;

public class RemoteAPISource implements MediaSource {
    private final String apiUrl;

    public RemoteAPISource(String apiUrl) { this.apiUrl = apiUrl; }

    @Override
    public String load() {
        String msg = "Fetched media via API: " + apiUrl;
        System.out.println("[RemoteAPISource] " + msg);
        return msg;
    }

    @Override
    public String getDescription() { return "Remote API"; }

    @Override
    public void play() {
        load();
        System.out.println("[RemoteAPISource] Playing remote API media: " + apiUrl);
    }
}
