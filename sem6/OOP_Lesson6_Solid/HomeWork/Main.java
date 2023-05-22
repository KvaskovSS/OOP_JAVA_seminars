public class Main {
    public static void main(String[] args) {
        UserRepository userRepository = new FileUserRepository();
        User user = new User("Bob", userRepository);
        user.report();
        user.save();
    }
}