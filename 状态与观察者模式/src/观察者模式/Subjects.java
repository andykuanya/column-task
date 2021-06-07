package 观察者模式;

import java.util.ArrayList;
import java.util.List;

public abstract class Subjects {
    protected List<ObserverO> observers;
    public Subjects()
    {
        observers = new ArrayList<>();
    }
    public void Add(ObserverO observer)
    {
        observers.add(observer);
    }
    public void Remove(ObserverO observer)
    {
        observers.remove(observer);
    }

    public abstract void notifyObserver();
}
