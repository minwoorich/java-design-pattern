package command.이벤트리스너;

import java.util.HashMap;
import java.util.Map;

public class Document {
    private final Map<String, MyElement> elements = new HashMap<>();

    public Document() {
        elements.put("button", new Button("button", "button", "button"));
    }

    public MyElement getElementById(String id) {
        return elements.get(id);
    }
}
