package com.mms.source;

public interface MediaSource {
    String load();
    String getDescription();
    void play(); // convenience: print and simulate play
}
