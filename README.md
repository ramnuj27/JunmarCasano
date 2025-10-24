# Modular Media Streaming Suite

This is a reference implementation for **Laboratory 2: Structural Design Pattern**.
It demonstrates the following structural patterns:
- **Composite** (Playlist + MediaItem)
- **Decorator** (Renderer decorators: Subtitle, Watermark, Equalizer)
- **Strategy** (Software vs Hardware rendering)
- **Proxy** (RemoteProxySource caching remote streams)

## Build & Run

Requirements: Java 11+, Maven

1. Build:
```
mvn clean compile
```

2. Run demo:
```
mvn exec:java -Dexec.mainClass="com.mms.app.Main"
```

The demo prints simulated playback and demonstrates pattern usage.

## Project structure

See `src/main/java/com/mms/...` and `docs/` for architecture and design rationale.
