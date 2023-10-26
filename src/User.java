import exceptions.WrongLoginException;
import exceptions.WrongPasswordException;

public class User {
    private String login;
    private String password;

    public User(String login, String password, String confirmPassword) {
        try {
            UserService.checkUserSignIn(login, password, confirmPassword);
            this.login = login;
            this.password = password;
            System.out.println("Пользователь " + getLogin() + " зарегистрирован!");
        } catch (WrongLoginException e) {
            System.out.println(e.getMessage());
        } catch (WrongPasswordException e) {
            System.out.println(e.getMessage());
        }
    }

    public String getLogin() {
        return login;
    }
}
