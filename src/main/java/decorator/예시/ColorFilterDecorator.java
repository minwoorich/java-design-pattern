package decorator.예시;

public class ColorFilterDecorator extends FruitFilterDecorator{
    public ColorFilterDecorator(FruitFilter fruitFilter) {
        super(fruitFilter);
    }

    @Override
    public boolean fruitFilter(Fruit fruit) {
        return super.fruitFilter(fruit) && colorFilter(fruit);
    }

    private boolean colorFilter(Fruit fruit) {
        return "빨강".equals(fruit.getColor());
    }
}
