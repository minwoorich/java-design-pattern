package factorymethod.before;

public class Client {
    public static void main(String[] args) {
        // YellowCard 대신 BlueCard를 사용 하려면 모든 인스턴스들의 구현체명을 바꿔줘야함
//        Product card1 = new YellowCard("박민우");
//        Product card2 = new YellowCard("정민우");
//        Product card3 = new YellowCard("김민우");
//        Product card4 = new YellowCard("이민우");

        Product card1 = new BlueCard("박민우");
        Product card2 = new BlueCard("정민우");
        Product card3 = new BlueCard("김민우");
        Product card4 = new BlueCard("이민우");
    }
}
