package coffeemaker;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer();
        Barista barista = new Barista();

        MenuItem m1 = new MenuItem("Americano", 1500);
        MenuItem m2 = new MenuItem("카페라떼", 2000);
        MenuItem m3 = new MenuItem("카라멜 마끼아또", 2500);
        MenuItem m4 = new MenuItem("에스프레소", 4000);
        List<MenuItem> list = new ArrayList<>();
        list.add(m1);
        list.add(m2);
        list.add(m3);
        list.add(m4);

        Menu menu = new Menu(list);

        customer.order("아메리카노", menu, barista);

    }
}
