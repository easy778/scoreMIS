package pojo;

public class Account {
    private String id;
    private String pwd;
    private String role;

    public Account() {
    }
    public Account(String id, String pwd,String role) {
        this.id = id;
        this.pwd = pwd;
        this.role = role;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }
}
