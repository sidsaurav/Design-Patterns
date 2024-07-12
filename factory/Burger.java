
public class Burger {
    String name;
    int price;

    Burger(String name, int cost) {
        this.name = name;
        this.price = cost;
    }

    static Burger createBurger(String name, int price) {
        return new Burger(name, price);
    }

    @Override
    public String toString() {
        return this.name + " costs " + this.price;
    }
}
