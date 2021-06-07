package 观察者模式;

public class ConcreteObjectA extends Subjects{
    public ConcreteObjectA()
    {
        super();
    }
    public void notifyObserver()
    {
       System.out.println("A目标发生变化了");
       for(ObserverO obs:observers)
       {
           obs.response();
       }
    }
}
