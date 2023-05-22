import java.io.*;

public class FileUserRepository implements UserRepository {
    private static final String FILE_PATH = "users.txt";

    public void save(User user) {
        try (FileWriter writer = new FileWriter(FILE_PATH, true)) {
            writer.write(user.getName() + "\n");
            writer.flush();
            System.out.println("User saved: " + user.getName());
        } catch (IOException e) {
            System.out.println("Error saving user: " + user.getName());
            e.printStackTrace();
        }
    }

    public User load(String name) {
        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_PATH))) {
            String line;
            while ((line = reader.readLine()) != null) {
                if (line.equals(name)) {
                    return new User(name, this);
                }
            }
        } catch (IOException e) {
            System.out.println("Error loading user: " + name);
            e.printStackTrace();
        }
        return null;
    }
}
