package decorator.예시;

import java.util.List;

public class Client {
    public static void main(String[] args) {
        System.out.println();
        List<Fruit> fruits =
                List.of(new Fruit("사과", 20,"빨강"),
                        new Fruit("사과", 20,"초록"),
                        new Fruit("배", 120,"빨강"),
                        new Fruit("사과", 20,"빨강"),
                        new Fruit("포도", 80,"보라"));


        FruitFilter defaultFilter = new AppleFilter();
        System.out.println("사과만 골라내기");
        for (Fruit fruit : fruits) {
            System.out.println(defaultFilter.fruitFilter(fruit));
//             true
//             true
//             false
//             true
        }

        FruitFilter fruitWithWeight = new WeightFilterDecorator(new AppleFilter());
        System.out.println("\n사과 && 100g 미만 골라내기");
        for (Fruit fruit : fruits) {
            System.out.println(fruitWithWeight.fruitFilter(fruit));
//            true
//            true
//            false
//            true
        }
        System.out.println("\n사과 && 빨강만 골라내기");
        FruitFilter fruitWithColor = new ColorFilterDecorator(new AppleFilter());
        for (Fruit fruit : fruits) {
            System.out.println(fruitWithColor.fruitFilter(fruit));
//            true
//            false
//            false
//            true
        }

        System.out.println("\n사과 && 빨강 && 100g 미만 골라내기");
        FruitFilter fruitWithColorWithWeight =
                new ColorFilterDecorator(
                new WeightFilterDecorator(
                        new AppleFilter()));

        for (Fruit fruit : fruits) {
            System.out.println(fruitWithColorWithWeight.fruitFilter(fruit));
//            true
//            false
//            false
//            true
        }

        FruitFilter grapeFilter = new WeightFilterDecorator(new GrapeFilter());
        System.out.println("\n포도만 골라내기");
        for (Fruit fruit : fruits) {
            System.out.println(grapeFilter.fruitFilter(fruit));
//             true
//             true
//             false
//             true
        }
    }
}
