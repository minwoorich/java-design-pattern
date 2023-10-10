package builder;

class User{
    final private String name; // required
    final private int age; // required
    private String addr; //optional
    private String phoneNum; // optional

    public User(String name, int age, String addr, String phoneNum) {
        this.name = name;
        this.age = age;
        this.addr = addr;
        this.phoneNum = phoneNum;
    }
}
//////////////////////////////////////////////////////////////
class NewUser {
    final private String name; // required
    final private int age; // required

    private String addr; //optional
    private String phoneNum; // optional

    public NewUser(UserBuilder builder) {
        this.name = builder.name;
        this.age = builder.age;
        this.addr = builder.addr;
        this.phoneNum = builder.phoneNum;
    }

    static class UserBuilder {
        final private String name; // required
        final private int age; // required

        private String addr; //optional
        private String phoneNum; // optional

        // 필수 값들은 UserBuilder의 생성자로 초기화해준다.
        public UserBuilder(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public UserBuilder addr(String addr) {
            this.addr = addr;
            return this;
        }

        public UserBuilder phoneNum(String phoneNum) {
            this.phoneNum = phoneNum;
            return this;
        }

        // 최종적으로 NewUser 객체를 생성해주는 메서드
        public NewUser build() {
            return new NewUser(this);
        }
    }

}
public class BuilderMain {
    public static void main(String[] args) {
        User user =
                new User("정민우",
                        26,
                        "서울시",
                        "01012345678");

        ///////////////////////////////////////

        NewUser newUser = new NewUser.UserBuilder("정민우", 26)
                .addr("서울시")
                .phoneNum("01012345678")
                .build();
    }
}
