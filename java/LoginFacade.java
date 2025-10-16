public class LoginFacade {
    private final UserList userList = UserList.getInstance();

    public boolean login(String username, String password) {
        return userList.validateLogin(username, password);
    }

    public boolean createAccount(String username, String password) {
        return userList.createAccount(username, password);
    }
}