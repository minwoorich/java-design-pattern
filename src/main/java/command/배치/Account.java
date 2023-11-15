package command.배치;


public class Account {
    private final String name;
    private Long balance;

    public Account(String name) {
        this.name = name;
        balance = 10000L;
    }

    public void deposit(Long amount) {
        balance+=amount;
    }

    public void withdraw(Long amount) {
        balance-=amount;
    }

    public void display() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "name = "+name+", "+"balance = " + balance;
    }
}
