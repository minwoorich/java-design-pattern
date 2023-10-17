package templatemethod.examplecode;

public class OnlineOrder extends Order {
    @Override
    protected void checkAmount() {
        System.out.println("구매수량 선택하기");
    }

    @Override
    protected void enteringAddress() {
        System.out.println("주소 입력하기");
    }

    @Override
    protected void choosePayment() {
        System.out.println("결제방식 선택하기");
    }

    @Override
    protected void accept() {
        System.out.println("구매확정");
    }

    @Override
    protected boolean isOnline() {
        return true;
    }
}
