package command.배치;

public class Withdraw implements Command{
    private final Account account;
    private final Long amount;

    public Withdraw(Account account, Long amount) {
        this.account = account;
        this.amount = amount;
    }

    @Override
    public void execute() {
        account.withdraw(amount);
    }
}
