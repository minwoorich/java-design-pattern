package command.이벤트리스너;


public abstract class MyElement {

    protected final Listeners listeners = new Listeners();
    protected final MyProperties properties = new MyProperties();


    public abstract void addEventListener(String type, Command handler);

    public void onClick() {
        listeners.listeners.get("click").execute();
    }

    public void onHover() {
        listeners.listeners.get("hover").execute();
    }

    public void onMouseout() {
        listeners.listeners.get("mouseout").execute();
    }

}
