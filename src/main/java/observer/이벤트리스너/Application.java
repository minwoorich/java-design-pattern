package observer.이벤트리스너;

public class Application {
    public static void main(String[] args) {
        // 버튼 생성
        Button button = new Button();

//        button.setOnClickListener(new Button.OnClickListener() {
//            @Override
//            public void onClick(Button button) {
//                button.count++;
//            }
//        });

        // 온클릭 리스너 등록
        button.setOnClickListener(btn -> btn.count++);

        System.out.println("클릭 전 : "+ button.count);
        button.onClick(); // 클릭
        button.onClick(); // 클릭
        button.onClick(); // 클릭
        button.onClick(); // 클릭
        button.onClick(); // 클릭
        System.out.println("클릭 후 : "+ button.getCount());

    }
}
