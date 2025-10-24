# Architecture Overview

The system separates responsibilities into modular packages:

- `source` — abstraction of media input types (Local, HLS, Remote). Proxy pattern used for caching remote streams.
- `playlist` — Composite pattern: Playlist and MediaItem allow nested playlists.
- `render` — Renderer and Decorators implement runtime-feature stacking (subtitles, watermark, equalizer).
- `strategy` — RenderingStrategy enables runtime switching between hardware and software rendering.
- `controller` — PlaybackController orchestrates playback flows.

This layout supports extensibility and clear separation of concerns for the lab deliverables.
