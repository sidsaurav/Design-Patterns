package singleton;

class Demo {

    private static Demo d;

    private Demo() {
    }

    public static Demo getInstance() {
        if (d == null) {
            d = new Demo();
            return d;
        } else {
            return d;
        }
    }
}

public class Main {
    public static void main(String[] args) {
        // Demo d1 = new Demo(); cant do this
        System.out.println(d1.x);
    }
}
