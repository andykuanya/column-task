package 装饰模式;

public class Decorating {
    private IBirthdayCake birthdayCake;
    public Decorating(IBirthdayCake birthdayCake)
    {
        this.birthdayCake = birthdayCake;
    }

    public void show()
    {
        birthdayCake.show();
    }
}
