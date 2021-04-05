public class Creditcard implements Pay{
    public Creditcard()
    {
        pay();
    }

    public void pay()
    {
        System.out.println("使用["+getClass().getName()+"]支付");
    }
}
