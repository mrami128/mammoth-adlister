
public class Config {

private final String user = "adlister_user" ;
private final String password = "password";
private final String url = "jdbc:mysql://localhost/adlister_db?serverTimezone=UTC";

   //constructor
    public Config() {


//        this.url = "jdbc:mysql://localhost:3306/adlister_db?serverTimezone=UTC";
//        this.user = "adlister_user";
//        this.password = "password";
    }

// 3 getters
    public String getUrl() {
        return url;
    }

    public String getUser() {
        return user;
    }

    public String getPassword() {
        return password;
    }
}
