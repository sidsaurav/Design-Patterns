package observer;

public class Main {
    public static void main(String[] args) {
        Observer o1 = new Observer("observer 1");
        Observer o2 = new Observer("observer 2");
        Observer o3 = new Observer("observer 3");

        Subject s1 = new Subject();

        s1.add(o1);
        s1.add(o3);

        s1._notify("Helloww");
    }
}
