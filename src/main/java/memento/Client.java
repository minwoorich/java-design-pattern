package memento;

public class Client {
    public static void main(String[] args) {
        Marine marine = new Marine(0,0);
        Marine.Save savePoint = null;

        System.out.println("게임시작");
        System.out.println("시작 위치 : "+marine);

        // 이동
        marine.move("up");
        marine.move("down");
        marine.move("left");
        marine.move("left");

        // 마린의 현재 위치 저장
        savePoint = marine.save();
        System.out.println("저장된 위치 : "+ savePoint);

        // 다시 이동
        marine.move("up");
        marine.move("left");
        marine.move("down");
        marine.move("down");

        // 마린 최종 위치
        System.out.println("불러오기 전 위치 : "+marine);

        // 저장된 위치 불러오기
        marine.load(savePoint);
        System.out.println("불러오기 후 위치 : "+marine);
    }
}
