import exceptions.WrongLoginException;
import exceptions.WrongPasswordException;

public class UserService {
    public static void checkUserSignIn(String login, String password, String confirmPassword) {
        if (!login.matches("^\\w{1,20}$")) {
            throw new WrongLoginException("Login должен быть длиной от 1-20 знаков " +
                    "и можеть сожержать только латинские буквы, цифры и знак подчеркивания");
        }
        if (!password.matches("^\\w{1,20}$") || !password.equals(confirmPassword)) {
            throw new WrongPasswordException("Password и ConfirmPassword должны быть равны, " +
                    "и могут содержать только латинские буквы, цифры и знак подчеркивания");
        }
    }
}

