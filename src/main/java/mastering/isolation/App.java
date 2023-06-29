package mastering.isolation;

public class App {

    public static void main(String[] args) {
        User testUser = new User("1", "Julia");
        UserRepository repository = new UserRepository();
        repository.save(testUser);
    }
}
