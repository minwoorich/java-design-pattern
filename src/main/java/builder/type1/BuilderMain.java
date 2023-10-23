package builder.type1;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

class User{
    final private String name; // required
    final private int age; // required

    private String addr; //optional
    private String phoneNum; // optional
    private String option1; // optional
    private String option2; // optional
    private String option3; // optional
    private String option4; // optional
    private String option5; // optional
    private String option6; // optional
    private String option7; // optional
    private String option8; // optional

    public User(String name, int age, String addr, String phoneNum, String option1, String option2, String option3, String option4, String option5, String option6, String option7, String option8) {
        this.name = name;
        this.age = age;
        this.addr = addr;
        this.phoneNum = phoneNum;
        this.option1 = option1;
        this.option2 = option2;
        this.option3 = option3;
        this.option4 = option4;
        this.option5 = option5;
        this.option6 = option6;
        this.option7 = option7;
        this.option8 = option8;
    }


}
//////////////////////////////////////////////////////////////
class NewUser {
    final private String name; // required
    final private int age; // required

    private String addr; //optional
    private String phoneNum; // optional
    private String option1; // optional
    private String option2; // optional
    private String option3; // optional
    private String option4; // optional
    private String option5; // optional
    private String option6; // optional
    private String option7; // optional
    private String option8; // optional

    public NewUser(UserBuilder builder) {
        this.name = builder.name;
        this.age = builder.age;
        this.addr = builder.addr;
        this.phoneNum = builder.phoneNum;
        this.option1 = builder.option1;
        this.option2 = builder.option2;
        this.option3 = builder.option3;
        this.option4 = builder.option4;
        this.option5 = builder.option5;
        this.option6 = builder.option6;
        this.option7 = builder.option7;
        this.option8 = builder.option8;
    }

    static class UserBuilder {
        final private String name; // required
        final private int age; // required

        private String addr; //optional
        private String phoneNum; // optional
        private String option1; // optional
        private String option2; // optional
        private String option3; // optional
        private String option4; // optional
        private String option5; // optional
        private String option6; // optional
        private String option7; // optional
        private String option8; // optional

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

        public UserBuilder option1(String option1) {
            this.option1 = option1;
            return this;
        }

        public UserBuilder option2(String option2) {
            this.option2 = option2;
            return this;
        }

        public UserBuilder option3(String option3) {
            this.option3 = option3;
            return this;
        }

        public UserBuilder option4(String option4) {
            this.option4 = option4;
            return this;
        }

        public UserBuilder option5(String option5) {
            this.option5 = option5;
            return this;
        }

        public UserBuilder option6(String option6) {
            this.option6 = option6;
            return this;
        }

        public UserBuilder option7(String option7) {
            this.option7 = option7;
            return this;
        }

        public UserBuilder option8(String option8) {
            this.option8 = option8;
            return this;
        }

        // 최종적으로 NewUser 객체를 생성해주는 메서드
        public NewUser build() {
            return new NewUser(this);
        }
    }

}

@AllArgsConstructor
@Builder
@Getter
class NewNewUser{
    @Builder.Default
    final private String name = "홍길동"; // required
    @Builder.Default
    final private int age = 32; // required

    private String addr; //optional
    private String phoneNum; // optional
    private String option1; // optional
    private String option2; // optional
    private String option3; // optional
    private String option4; // optional
    private String option5; // optional
    private String option6; // optional
    private String option7; // optional
    private String option8; // optional
}

public class BuilderMain {
    public static void main(String[] args) {
        User user =
                new User("정민우", 26, "서울시", "01012345678", null, null, null, null, null, null, null, null);

        ///////////////////////////////////////

        NewUser newUser = new NewUser.UserBuilder("정민우", 26)
                .addr("서울시")
                .phoneNum("01012345678")
                .build();

        NewNewUser newNewUser = new NewNewUser.NewNewUserBuilder()
                .name("김민우")
                .age(22)
                .addr("서울시")
                .phoneNum("01011112222")
                .build();

        System.out.println(newNewUser.getName());
    }
}
