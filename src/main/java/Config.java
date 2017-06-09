
public class Config {

private String url;
private String user;
private String password;

//constructor
    public Config() {
        this.url = "jdbc:mysql://localhost:3306/adlister_db?serverTimezone=UTC";
        this.user = "adlister_user";
        this.password = "password";
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
