package rate_limiter.model;

import rate_limiter.enums.UserTier;

public class User {
    private final String userId;
    private final UserTier tier;

    // Constructor replaces @AllArgsConstructor
    public User(String userId, UserTier tier) {
        this.userId = userId;
        this.tier = tier;
    }

    // Getters replace @Getter
    public String getUserId() {
        return userId;
    }

    public UserTier getTier() {
        return tier;
    }
}