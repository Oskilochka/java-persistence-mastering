package mastering.isolation;

import java.util.Map;
import java.util.Optional;

public class UserDAO {
    private final Mapper mapper = new Mapper();
    private final Database database = Database.INSTANCE;

    public  void insert(User user) {
        Map<String, Object> entry = mapper.toEntry(user);
        database.insert(user.id(), entry);
    }

    public Optional<User> findById(String id) {
        Map<String, Object> retrieve = database.retrieve(id);
        return mapper.toEntity(retrieve);
    }
}
