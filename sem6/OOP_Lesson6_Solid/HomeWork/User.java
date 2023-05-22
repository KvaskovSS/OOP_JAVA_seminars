public class User{
	private String name;
	private UserRepository userRepository;

	public User(String name, UserRepository userRepository) {
        this.name = name;
        this.userRepository = userRepository;
    }
	
	public String getName() {
        return name;
    }

    public void save() {
        userRepository.save(this);
    }

    public void report() {
        System.out.println("Report for user: " + name);
    }

}