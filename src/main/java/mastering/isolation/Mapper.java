package mastering.isolation;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class Mapper {
    public Map<String, Object> toEntry(User user) {
        Map<String, Object> entry = new HashMap<>();

        entry.put("id", user.id());
        entry.put("name", user.name());

        return entry;
    }
    public Optional<User> toEntity(Map<String, Object> entry) {
        if (!entry.isEmpty()) {
            User user = new User((String) entry.get("id"), (String) entry.get("name"));

            return Optional.of(user);
        }

        return Optional.empty();
    }
}
