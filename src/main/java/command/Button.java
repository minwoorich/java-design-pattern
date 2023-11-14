package command;


public class Button extends MyElement{

    public Button(String id, String clazz, String tagName) {
        properties.id = id;
        properties.clazz = clazz;
        properties.tagName = tagName;
    }

    @Override
    public void addEventListener(String type, Command handler) {
        listeners.setListener(type, handler);
    }

    @Override
    public String toString() {
        return  "listeners : "+ listeners.listeners.toString() +"\n" +
                "properties : { "+properties+" }\n";
    }
}
