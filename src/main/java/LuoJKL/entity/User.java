package LuoJKL.entity;

public class User {

    private Integer id;
    private String userName;
    private String password;

    public Integer getId() {
        return id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return password;
    }

    public void setPassWord(String password) {
        this.password = password;
    }

    public void setId(Integer id) {
        this.id = id;

    }
}
