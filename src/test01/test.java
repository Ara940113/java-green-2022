package test01;

import java.util.List;

class Customer {
    public void order(String menuName, Menu menu, Barista barista) {
        MenuItem menuItem = menu.choose(menuName);
        Coffee coffee = barista.makeCoffee(menuItem);
    }

}

class MenuItem {
    public MenuItem(String name, int price) {
        // this.name = name;
        // this.price = price;
    }

    // public int cost() {
    // return price;
    // }

    // public String getName() {
    // return this.name;
}
// }

class Menu {
    private List<MenuItem> items;

    public Menu(List<MenuItem> ites) {
        // this.items = items;
    }

    public MenuItem choose(String name) {
        for (MenuItem each : items) {
            // if (each.getName().equals(name)) {
            return each;
        }
        // }
        return null;
    }
}

class Barista {
    public Coffee makeCoffee(MenuItem menuItem) {
        Coffee coffee = new Coffee(menuItem);
        return coffee;
    }
}

class Coffee {
    private String name;
    private int price;

    public Coffee(MenuItem menuItem) {
        // this.name = menuItem.getName();
        // this.price = menuItem.cost();
    }
}

public class test {
    public static void main(String[] args) {

    }

}
