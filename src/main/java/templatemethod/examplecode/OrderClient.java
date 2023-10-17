package templatemethod.examplecode;

public class OrderClient {
    public static void main(String[] args) {
        Order online = new OnlineOrder();
        Order offline = new OfflineOrder();

        System.out.println("<<온라인주문>>");
        online.process();
        System.out.println();
        System.out.println("<<오프라인주문>>");
        offline.process();
    }
}
