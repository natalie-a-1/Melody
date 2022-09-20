public class User {
    private static String name;
    private static String password;
    private static SpotifyAccount account;

    public User(String name, String password, SpotifyAccount account) {
        User.name = name;
        User.password = password;
        User.account = account;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        User.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        User.password = password;
    }

    public SpotifyAccount getAccount() {
        return account;
    }

    public void setAccount(SpotifyAccount account) {
        User.account = account;
    }

}