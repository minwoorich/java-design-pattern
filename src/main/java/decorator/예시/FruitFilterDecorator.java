package decorator.예시;

public abstract class FruitFilterDecorator  implements FruitFilter{
    private final FruitFilter fruitFilter;

    public FruitFilterDecorator(FruitFilter fruitFilter) {
        this.fruitFilter = fruitFilter;
    }

    @Override
    public boolean fruitFilter(Fruit fruit) {
        return fruitFilter.fruitFilter(fruit);
    }
}
