package 装饰模式;

import java.security.PublicKey;

public class Fruit extends Decorating{
    public void PutFruit()
    {
        System.out.println("加点水果");
    }
    public Fruit(IBirthdayCake birthdayCake)
    {
        super(birthdayCake);
    }
}
