package po;

public class User {
    private int id;
//    @NotNull(message = "{user.username.isnull}")
//    @Size(min = 1,max = 30,message = "{user.username.length.error}")
    private String username;
    private String password;

    public User(){

    }

    @Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", password=" + password + "]";
	}

	public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
}
