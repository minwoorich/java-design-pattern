package mediator;

public class Runway {
    private boolean isEmpty;

    public Runway(boolean isEmpty) {
        this.isEmpty = isEmpty;
    }

    public void setEmpty(boolean empty) {
        isEmpty = empty;
    }

    public boolean isEmpty() {
        return isEmpty;
    }
}
