package command.이벤트리스너;


public class MyProperties {
    String id = null;
    String clazz = null;
    String tagName = null;
    int value = 0;
    String innerText = null;

    @Override
    public String toString() {
        return "id="+id + ", clazz="+clazz + ", tagName="+tagName + ", value="+value + ", innerText="+innerText;
    }
}
