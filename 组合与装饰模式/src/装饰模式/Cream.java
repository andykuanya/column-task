package 装饰模式;


public class Cream extends Decorating{
    public void PutCream()
    {
        System.out.println("加奶油");
    }

    public Cream(IBirthdayCake birthdayCake)
    {
        super(birthdayCake);
    }
}
