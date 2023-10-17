package factorymethod.after;

import factorymethod.simplefactory.SimpleCardFactory;

public class Client {
    public static void main(String[] args) {
        // SimpleCardFactory 클래스를 사용하면 아래와 같이 동적으로 cardType을 전달할 수 있음
        SimpleCardFactory factory = new SimpleCardFactory();
//        String cardType = "YellowCard";
        String cardType = "BlueCard";

        Product card1 = factory.create(cardType, "박민우");
        Product card2 = factory.create(cardType, "정민우");
        Product card3 = factory.create(cardType, "김민우");
        Product card4 = factory.create(cardType, "이민우");

        // simpleFactory에 없는 카드의 경우 해당 카드만 따로 추가해주면되는데
        // 문제는 이때 코드 수정이 불가피 해진다 -> OCP위반
    }
}
