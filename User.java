import java.util.ArrayList;

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

    public Feed GetFeed() {
        return new Feed();
    }

    public ArrayList<String> FavoriteSongs() {
        ArrayList<String> temp = new ArrayList<String>();

        temp.add("Song1");
        temp.add("Song2");
        temp.add("Song3");

        return temp;
    }

}