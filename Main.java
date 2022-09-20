
public class Main {
    public static void main(String[] args) {

        SpotifyAccount account = new SpotifyAccount();
        User Natalie = new User("Natalie", "temp", account);
        System.out.println(Natalie.getName());
    }
}
