public class AaluBurger implements Burger {

    @Override
    public int getCost() {
        return 60;
    }

    @Override
    public String getName() {
        return "Aalu wala burger";
    }

    @Override
    public String toString() {
        return this.getName() + " for " + this.getCost();
    } 
}
