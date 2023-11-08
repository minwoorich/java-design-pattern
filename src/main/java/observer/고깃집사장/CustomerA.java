package observer.고깃집사장;

public class CustomerA implements Observer{
    @Override
    public void moveToRestaurant() {
        System.out.println("손님 A 고깃집으로 출발");
    }
}
