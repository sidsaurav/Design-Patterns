package decorator.toppings;

import decorator.burger.Burger;

public class CheeseBurger implements Burger {
    Burger b;

    public CheeseBurger(Burger b) {
        this.b = b;
    }

    @Override
    public String getName() {
        return b.getName() + " with cheese";
    }

    @Override
    public double getCost() {
        return b.getCost() + 20.0;
    }

}
