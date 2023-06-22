public class Program {
    public static void main(String[] args) {
        String login = "Alice";
        String password = "qwerty";
        User us = new User(login, password);
        us.account.displayAccount();
    }
}
