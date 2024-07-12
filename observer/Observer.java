package observer;

public class Observer {
    String name;

    Observer(String name) {
        this.name = name;
    }

    void update(String msg) {
        System.out.println(this.name + " " + "is updated : " + msg);
    }
}