package builder;

public class User {
    private final String name;
    private final String age;
    private final String id;
    private final String pw;
    private final String email;
    private final String phonenum;
    private final String gender;

    public User(String name, String age, String id, String pw, String email, String phonenum, String gender) {
        this.name = name;
        this.age = age;
        this.id = id;
        this.pw = pw;
        this.email = email;
        this.phonenum = phonenum;
        this.gender = gender;
    }
}
