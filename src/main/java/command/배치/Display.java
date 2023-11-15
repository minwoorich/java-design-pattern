package command.배치;

public class Display implements Command{
    private final Account account;

    public Display(Account account) {
        this.account = account;
    }

    @Override
    public void execute() {
        account.display();
    }
}
