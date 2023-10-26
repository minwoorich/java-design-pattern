package decorator.예시;

public class WeightFilterDecorator extends FruitFilterDecorator{
    public WeightFilterDecorator(FruitFilter fruitFilter) {
        super(fruitFilter);
    }

    @Override
    public boolean fruitFilter(Fruit fruit) {
        return super.fruitFilter(fruit) && weightFilter(fruit);
    }

    private boolean weightFilter(Fruit fruit) {
        return fruit.getWeight() < 100;
    }
}
