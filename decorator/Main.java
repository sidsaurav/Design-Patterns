package decorator;

import decorator.burger.AaluBurger;
import decorator.toppings.CheeseBurger;
import decorator.toppings.MayoBurger;

public class Main {

    public static void main(String[] args) {
        AaluBurger a1 = new AaluBurger();
        CheeseBurger c1 = new CheeseBurger(a1);
        MayoBurger cm = new MayoBurger(c1);

        System.out.println(cm.getName());
        System.out.println(cm.getCost());
    }
}
