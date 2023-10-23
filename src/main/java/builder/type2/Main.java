package builder.type2;

import lombok.AllArgsConstructor;
import lombok.Builder;

class User{
    private final String id;// required
    private final String pw;// required

    private String phone;// optional
    private String addr;// optional

    public User(String id, String pw, String phone, String addr) {
        this.id = id;
        this.pw = pw;
        this.phone = phone;
        this.addr = addr;
    }
}

class NewUser{
    private final String id;// required
    private final String pw;// required
    private String phone;// optional
    private String addr;// optional
    public NewUser(SimpleBuilder builder) {
        this.id = builder.id;
        this.pw = builder.pw;
        this.phone = builder.phone;
        this.addr = builder.addr;
    }
    static class SimpleBuilder {
        private final String id; // required
        private final String pw; // required

        private String phone; // optional
        private String addr; // optional
        public SimpleBuilder(String id, String pw) {
            this.id = id;
            this.pw = pw;
        }
        public SimpleBuilder phone(String phone) {
            this.phone = phone;
            return this;
        }
        public SimpleBuilder addr(String addr) {
            this.addr = addr;
            return this;
        }
        public NewUser build() {
            return new NewUser(this);
        }
    }
}

@AllArgsConstructor
@Builder
class UserWithLombok {
    private final String id;// required
    private final String pw;// required
    private String phone;// optional
    private String addr;// optional
}

public class Main{
    public static void main(String[] args) {
        User user = new User("아이디", "비밀번호", "폰번호", "주소");

        NewUser newUser = new NewUser.SimpleBuilder("아이디", "비밀번호")
                .phone("폰번호")
                .addr("주소")
                .build();
    }
}
