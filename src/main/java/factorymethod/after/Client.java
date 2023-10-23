package factorymethod.after;


public class Client {
    public static void main(String[] args) {

        // FactoryMethod 패턴을 사용하면 아래와 같이 카드 구현체가 바뀔경우에
        // 사용자는 Product 인스턴스를 건드릴 필요없이
        // 해당하는 카드의 factory 클래스만 추가해주면 됨 (Ex. BlackCardFactory)
        // 확장에는 열려있고, 수정에는 변경되어있음.
        Factory factory = new YellowCardFactory();
//        Factory factory = new BlueCardFactory();
//        Factory factory = new BlackCardFactory();

        Product card1 = factory.create("정민우");
        Product card2 = factory.create("김민우");
        Product card3 = factory.create("박민우");
        Product card4 = factory.create("오민우");
    }
}
