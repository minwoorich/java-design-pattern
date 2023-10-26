package decorator.예시;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
@AllArgsConstructor
public class Fruit {
    String name;
    int weight;
    String color;
}
