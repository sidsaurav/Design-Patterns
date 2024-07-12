package observer;

import java.util.List;
import java.util.ArrayList;

class Subject {
    private List<Observer> obs = new ArrayList<Observer>();

    public void add(Observer o) {
        if (obs.contains(o) == false) {
            obs.add(o);
        }
    }

    public void remove(Observer o) {
        if (obs.contains(o) == true) {
            obs.remove(o);
        }
    }

    public void _notify(String msg) {
        for (Observer o : obs) {
            o.update(msg);
        }
    }
}