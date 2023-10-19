package factorymethod.after;

public class BlueCardFactory implements Factory{
    @Override
    public Product create(String owner) {
        return new BlueCard(owner);
    }
}
