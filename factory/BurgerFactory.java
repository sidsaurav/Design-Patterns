public class BurgerFactory {

    static Burger createBurger(String type) {
        if (type == "Aalu Burger") {
            return new AaluBurger();
        } else if (type == "Paneer Burger") {
            return new PaneerBurger();
        } else {
            return null;
        }
    }
}
