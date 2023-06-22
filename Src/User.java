public class User {
    private String login;
    Account account;

    public User(String login, String password) {
        this.login = login;
        account = new Account(password);
    }
    public class Account{
        String password;

        public Account(String password) {
            this.password = password;
        }
        void displayAccount(){
            System.out.printf("Account Login successful! Login: %s \t Password: %s \n", login, password);
        }
    }
}
