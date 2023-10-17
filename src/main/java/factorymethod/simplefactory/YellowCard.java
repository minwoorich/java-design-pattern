package factorymethod.simplefactory;

public class YellowCard implements Product {
    private String owner;

    public YellowCard(String owner) {
        System.out.println(owner + "의 카드를 만듭니다");
        this.owner = owner;
    }
    @Override
    public void use() {
        System.out.println("옐로카드를 사용합니다");
    }
}
