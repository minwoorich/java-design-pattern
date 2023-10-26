package decorator.예시;

public class AppleFilter implements FruitFilter{
    @Override
    public boolean fruitFilter(Fruit fruit) {
        return "사과".equals(fruit.getName());
    }
}
