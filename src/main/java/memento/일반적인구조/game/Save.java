package memento.일반적인구조.game;

import lombok.Getter;

@Getter
public class Save{
    private int x, y;
    Save(int x, int y){
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "("+x+", "+y+")";
    }
}
