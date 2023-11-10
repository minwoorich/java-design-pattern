package memento.일반적인구조.game;

public class Marine {
    private int currentX, currentY;

    public Marine(int currentX, int currentY) {
        this.currentX = currentX;
        this.currentY = currentY;
    }

    public void move(String action) {
        System.out.println(action); // 이동 방향 출력
        if ("up".equals(action)) {
            currentY++;
        } else if ("down".equals(action)) {
            currentY--;
        } else if ("right".equals(action)) {
            currentX++;
        } else {
            currentX--;
        }
    }

    @Override
    public String toString() {
        return "("+currentX+", "+currentY+")";
    }

    public Save save() {
        System.out.println("********저장하기********");
        return new Save(currentX, currentY);
    }

    public void load(Save savePoint) {
        System.out.println("********불러오기********");
        currentX = savePoint.getX();
        currentY = savePoint.getY();
    }
}

