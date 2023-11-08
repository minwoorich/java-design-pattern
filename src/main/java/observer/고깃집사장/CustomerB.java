package observer.고깃집사장;

public class CustomerB implements Observer{
    @Override
    public void moveToRestaurant() {
        System.out.println("손님 B 고깃집으로 출발");
    }
}
