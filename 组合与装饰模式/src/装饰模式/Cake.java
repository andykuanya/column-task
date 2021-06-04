package 装饰模式;

public class Cake implements IBirthdayCake{
    public Cake()
    {
        System.out.println("蛋糕坯建好了");
    }

    public void show()
    {
        System.out.println("蛋糕坯");
    }
}
