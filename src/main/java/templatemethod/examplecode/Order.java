package templatemethod.examplecode;

public abstract class Order {
    abstract protected void checkAmount();
    abstract protected void enteringAddress();
    abstract protected void choosePayment();
    abstract protected void accept();

    protected boolean isOnline() {
        return true;
    }

    public final void process() {
        checkAmount();
        if (isOnline()) {
            enteringAddress();
        }
        choosePayment();
        accept();
    }
}
