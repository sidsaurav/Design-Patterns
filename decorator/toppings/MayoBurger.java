package decorator.toppings;

import decorator.burger.Burger;

public class MayoBurger implements Burger {
    Burger b;

    public MayoBurger(Burger b) {
        this.b = b;
    }

    @Override
    public String getName() {
        return b.getName() + " with mayo";
    }

    @Override
    public double getCost() {
        return b.getCost() + 15.0;
    }

}