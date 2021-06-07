package 适配器模式.pro;

public class MyFruit {
    private String fruit;
    public MyFruit(String fruit)
    {
        this.fruit = fruit;
    }
    public String Get()
    {
        return fruit;
    }
}
