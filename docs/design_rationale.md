# Design Rationale (<=800 words)

**Objective.** Evolve a messy legacy media player into a modular suite supporting multiple sources, runtime plugins,
composite playlists, runtime renderer switching, and remote caching.

**Patterns chosen:**
- **Adapter-style interface (MediaSource):** Standardizes how the system loads media from different sources (local file,
  HLS, remote API). This decouples playback logic from source-specific code.
- **Composite (Playlist):** Playlists can contain MediaItems or nested Playlists, allowing uniform traversal and playback.
- **Decorator (Renderer):** Features such as subtitles, watermarking, and equalization are added dynamically by wrapping
  a base renderer. This avoids combinatorial subclassing and supports runtime toggles.
- **Strategy (RenderingStrategy):** Runtime switching between hardware and software renderers is handled by the Strategy
  pattern, enabling selection without changing client code.
- **Proxy (RemoteProxySource):** Adds caching to remote sources, improving demo performance and simulating bandwidth savings.

**Trade-offs & practical notes:**
- The demo simulates rendering and streaming via console output. Production code should use asynchronous streaming,
  persistent caches, and real rendering APIs.
- Decorators add runtime overhead but provide flexibility; if strict performance required, consider compile-time configuration.
- The proxy here is in-memory for simplicity; in real systems use disk-backed caches with eviction policies.

This design focuses on clarity and demonstrability for the laboratory while keeping paths open for future real-world enhancements.
