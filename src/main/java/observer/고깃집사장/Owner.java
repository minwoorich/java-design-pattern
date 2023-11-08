package observer.고깃집사장;


import java.util.ArrayList;
import java.util.List;

public class Owner {
    private final List<Observer> customers = new ArrayList<>();
    public void register(Observer pet) {
        customers.add(pet);
    }

    public void call() {
        for (Observer customer : customers) {
            customer.moveToRestaurant();
        }
    }
}
