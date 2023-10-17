package factorymethod.after;

public class BlueCard implements Product {
    private String owner;

    public BlueCard(String owner) {
        this.owner = owner;
    }

    @Override
    public void use() {
        System.out.println("블루카드를 사용합니다");
    }
}
