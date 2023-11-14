package command;

public class Application {
    static Document document = new Document();
    public static void main(String[] args) {
        MyElement button = document.getElementById("button");
        MyElement counter = document.getElementById("counter");


//        button.addEventListener("click", new ClickCommand());
//        button.addEventListener("hover", new HoverCommand());
//        button.addEventListener("mouseout", new MouseOutCommand());


        button.addEventListener("click", () -> {
            button.properties.value++;
        });

        button.addEventListener("hover", () -> {
            button.properties.innerText = "마우스가 올라갔어용";
        });

        button.addEventListener("mouseout", () -> {
            button.properties.innerText = "마우스가 나갔네요";
        });

        // 1. 초기 값
        System.out.println(button);
        button.onClick();
        button.onClick();
        button.onClick();
        button.onHover();

        // 2. 클릭 3번 + 마우스호버
        System.out.println(button);
        button.onClick();
        button.onClick();
        button.onMouseout();

        // 3. 클릭 2번 + 마우스아웃
        System.out.println(button);

    }
}
