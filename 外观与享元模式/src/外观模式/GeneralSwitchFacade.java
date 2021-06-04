package 外观模式;

public class GeneralSwitchFacade
{
    private Light lights[] = new Light[4];
    private Fan fan;

    public GeneralSwitchFacade()
    {
        lights[0] = new Light("餐厅");
        lights[1] = new Light("客厅");
        lights[2] = new Light("走廊");
        lights[3] = new Light("阳台");
        fan = new Fan();
    }

    public void on()
    {
        for(int i = 0;i<4;i++)
            lights[i].on();
        fan.on();
    }

    public void off()
    {
        for(int i = 0;i<4;i++)
            lights[i].off();
        fan.off();
    }
}
