package rate_limiter.model;

public class RateLimitConfig {
    private final int maxRequests;
    private final int windowInSeconds;

    // Constructor replaces @AllArgsConstructor
    public RateLimitConfig(int maxRequests, int windowInSeconds) {
        this.maxRequests = maxRequests;
        this.windowInSeconds = windowInSeconds;
    }

    // Getters replace @Getter
    public int getMaxRequests() {
        return maxRequests;
    }

    public int getWindowInSeconds() {
        return windowInSeconds;
    }
}