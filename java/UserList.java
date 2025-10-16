import java.util.*;

public class UserList {
    private static UserList instance;
    private final Map<String, User> users;

    private UserList() {
        users = new HashMap<>();
        loadHardcodedUsers();
    }

    public static UserList getInstance() {
        if (instance == null) {
            instance = new UserList();
        }
        return instance;
    }

    private void loadHardcodedUsers() {
        users.put("alice", new User("anna", "1234"));
        users.put("bob", new User("ben", "qwerty"));
    }

    public boolean validateLogin(String username, String password) {
        User user = users.get(username);
        return user != null && user.checkPassword(password);
    }

    public boolean createAccount(String username, String password) {
        if (users.containsKey(username)) return false;
        users.put(username, new User(username, password));
        return true;
    }

    public Collection<User> getAllUsers() {
        return users.values();
    }
}
