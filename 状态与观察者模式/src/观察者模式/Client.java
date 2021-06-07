package 观察者模式;

public class Client {
    public static void main(String[] args) {
        Subjects subject = new ConcreteObjectA();
        ObserverO obs1 = new ConcreteObserver1();
        ObserverO obs2 = new ConcreteObserver2();
        subject.Add(obs1);
        subject.Add(obs2);
        subject.notifyObserver();
    }
}
