package Bean;

public class User {
    private String uname;
    private int uid;
    private int uage;

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public int getUage() {
        return uage;
    }

    public void setUage(int uage) {
        this.uage = uage;
    }

    public User() {
    }

    public User(String uname, int uid, int uage) {
        this.uname = uname;
        this.uid = uid;
        this.uage = uage;
    }

    @Override
    public String toString() {
        return "User{" +
                "uname='" + uname + '\'' +
                ", uid=" + uid +
                ", uage=" + uage +
                '}';
    }
}
