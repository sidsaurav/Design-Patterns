package decorator.burger;

public class PaneerBurger implements Burger {

    @Override
    public String getName() {
        return "Paneer burger";
    }

    @Override
    public double getCost() {
        return 80.0;
    }

}
