package factorymethod.after;


public class YellowCardFactory implements Factory {
    @Override
    public Product create(String owner) {
        return new YellowCard(owner);
    }
}
