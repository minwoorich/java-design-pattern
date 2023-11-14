package command;


import java.util.HashMap;
import java.util.Map;

public class Listeners {
    Map<String, Command> listeners = new HashMap<>();

    public void setListener(String type, Command handler) {
        listeners.put(type, handler);
    }

    @Override
    public String toString() {
        return listeners.toString();
    }
}
