public interface UserRepository {
    void save(User user);
    User load(String name);
}
