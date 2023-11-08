package observer.고깃집사장;

public class Client {
    public static void main(String[] args) {
        Observer customerA = new CustomerA();
        Observer customerB = new CustomerB();

        Owner owner = new Owner();

        owner.register(customerA);
        owner.register(customerB);

        owner.call();
    }
}
