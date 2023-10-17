package adapter;

import adapter.withclass.Print;
import adapter.withclass.PrintBanner;

public class AdapterMain {
    public static void main(String[] args) {
        Print p = new PrintBanner("Hello");
        p.printWeak();
        p.printStrong();
    }
}
