public class HelloWorld
{
    public static void main(String[] args) {
        String username = Eingabe();
        String password = Eingabe();
        User user = GetUserByName(username);
        boolean isloginSucessfuly = false;
        if (user != null) {
            if (password != null) {
                if (user.Password == password) {
                    if (user.IsActive) {
                        isloginSucessfuly = true;
                    }
                    else {
                        throw new Exception("User ist gesperrt")
                    }
                }
                else {
                    throw new Exception("Password is not correct");
                }
            }
            else {
                throw new Exception("User didnt enter a password");
            }
        }
        else {
            throw new Exception("User didnt exist");
        }
        return isloginSucessfuly;
    }

    public static void main(String[] args) {
        String username = Eingabe();
        String password = Eingabe();
        User user = GetUserByName(username);

        if (user == null) {
            throw new Exception("User didnt exist");
        }
        if (password == null) {
            throw new Exception("User didnt enter a password");
        }
        if (user.Password == password) {
            throw new Exception("Password is not correct");
        }
        if (user.IsActive) {
            throw new Exception("User ist gesperrt");
        }

        boolean isloginSucessfuly = true;
        return isloginSucessfuly;
    }

    public static void main(String[] args) {
        String username = Eingabe();
        String password = Eingabe();
        User user = GetUserByName(username);
        boolean isloginSucessfuly = false;
        String msg = "";
        if (user != null) {
            if (password != null) {
                if (user.Password == password) {
                    if (user.IsActive) {
                        isloginSucessfuly = true;
                        msg = "Login erfolgreich";
                    }
                    else {
                        isloginSucessfuly = false;
                        msg = "User ist deaktiviert";
                    }
                }
                else {
                    isloginSucessfuly = false;
                    msg = "Password is not correct";
                }
            }
            else {
                isloginSucessfuly = false;
                msg = "User didnt enter a password";
            }
        }
        else {
            isloginSucessfuly = false;
            msg = "User didnt exist";
        }
        System.out.println(msg);
        return isloginSucessfuly;
    }

    public static void main(String[] args) {
        String username = Eingabe();
        String password = Eingabe();
        User user = GetUserByName(username);

        if (user == null) {
            return PrintError("User didnt exist");
        }
        if (password == null) return PrintError("User didnt enter a password");
        if (user.Password == password) return PrintError("Password is not correct");
        if (user.IsActive) return PrintError("User ist gesperrt");

        System.out.println("Login erfolgreich");

        boolean isloginSucessfuly = true;
        return isloginSucessfuly;
    }

    private boolean PrintError(String msg) {
        System.out.println(msg);
        return false;
    }
}