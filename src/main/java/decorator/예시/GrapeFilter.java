package decorator.예시;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@AllArgsConstructor
@Builder
@Getter
public class GrapeFilter implements FruitFilter {
    @Override
    public boolean fruitFilter(Fruit fruit) {
        return "포도".equals(fruit.getName());
    }
}
