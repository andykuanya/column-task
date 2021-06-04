package 外观模式;

public class Fan {
    public void on()
    {
        System.out.println(getClass().getName()+" is on");
    }
    public void off()
    {
        System.out.println(getClass().getName()+" is off");
    }
}
