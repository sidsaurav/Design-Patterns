public class PaneerBurger implements Burger {

    @Override
    public int getCost() {
        return 100;
    }

    @Override
    public String getName() {
        return "Paneeer Burger";
    }

    @Override
    public String toString() {
        return this.getName() + " for " + this.getCost();
    }
}
