package 观察者模式;

public class ConcreteObjectB extends Subjects{
    public ConcreteObjectB()
    {
        super();
    }
    public void notifyObserver()
    {
        System.out.println("B目标发生变化了");
        for(ObserverO obs:observers)
        {
            obs.response();
        }
    }
}
