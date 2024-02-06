package Observer;

import java.util.HashSet;
import java.util.Set;

public abstract class Subject {

    Set<Observer> observers = new HashSet<>();

    public void registerObserver(Observer o){
        observers.add(o);
    };
    public void removeObserver(Observer o){
        observers.remove(o);
    };
    public void notifyObservers(){
        for (Observer o : observers){
            o.update();
        }
    };

}
