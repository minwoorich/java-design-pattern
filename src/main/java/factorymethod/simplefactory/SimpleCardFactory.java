package factorymethod.simplefactory;

public class SimpleCardFactory {
    // BlackCard가 필요하면 switch문을 수정 해줘야함 -> OCP위반!
    public Product create(String type, String owner) {
        switch (type) {
            case "YellowCard" :
                return new YellowCard(owner);
            case "BlueCard" :
                return new BlueCard(owner);
            default:
                throw new IllegalArgumentException("존재하지 않는 타입입니다");
        }
    }
}
