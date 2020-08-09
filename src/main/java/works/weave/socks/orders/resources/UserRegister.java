package works.weave.socks.orders.resources;

public class UserRegister {
    String username;
    String password;
    String email;

    public UserRegister (String username, String password,String email){
        this.username = username;
        this.password = password;
        this.email = email;
    }

    @Override
    public String toString() {
        return "UserRegister{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
