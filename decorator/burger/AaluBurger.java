package decorator.burger;

public class AaluBurger implements Burger {

    @Override
    public String getName() {
        return "Aalu burger";
    }

    @Override
    public double getCost() {
        return 60.0;
    }

}
