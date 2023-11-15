package command.배치;

public class Deposit implements Command{
    private final Account account;
    private final Long amount;

    public Deposit(Account account, Long amount) {
        this.account = account;
        this.amount = amount;
    }

    @Override
    public void execute() {
        account.deposit(amount);
    }


}
