package 外观模式;

public class Light {
    private String location;
    public Light(String location)
    {
        this.location = location;
    }
    public void on()
    {
        System.out.println(getClass().getName()+"["+location+"]"+" is on");
    }
    public void off()
    {
        System.out.println(getClass().getName()+"["+location+"]"+" is off");
    }
}
