public class LoginTest {
    public static void main(String[] args) {
        LoginFacade facade = new LoginFacade();

        System.out.println("Login anna/1234: " + facade.login("anna", "1234"));
        System.out.println("Login ben/wrong: " + facade.login("ben", "wrong"));

        System.out.println("Create new user charlie/pass: " + facade.createAccount("charlie", "pass"));
        System.out.println("Login charlie/pass: " + facade.login("charlie", "pass"));
        System.out.println("Create duplicate anna: " + facade.createAccount("anna", "newpass"));
    }
}
