package mastering.isolation;

import java.util.*;

public enum Database {
    INSTANCE;
    private final Map<String, Map<String, Object>> data = new HashMap<>();
    public Map<String, Object> retrieve(String key) {
        Map<String, Object> entry = this.data.get(key);
        return Optional.ofNullable(entry)
                .map(Collections::unmodifiableMap)
                .orElse(Collections.emptyMap());
    }
    public void insert(String key, Map<String, Object> entry) {
        Objects.requireNonNull(key, "key is required");
        Objects.requireNonNull(entry, "entry is required");

        if (!retrieve(key).isEmpty()) {
            throw new IllegalStateException("You can't overwrite data. Use Update method instead.");
        }

        this.data.put(key, entry);
    }

    public void update(String key, Map<String, Object> entry) {
        Objects.requireNonNull(key, "key is required");
        Objects.requireNonNull(entry, "entry is required");

        if (!retrieve(key).isEmpty()) {
            throw new IllegalStateException("You can't update a non-existing data");
        }

        this.data.remove(key);
    }
}
