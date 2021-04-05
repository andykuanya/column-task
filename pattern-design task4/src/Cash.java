public class Cash implements Pay{
    public Cash(){
        pay();
    }
    public void pay()
    {
        System.out.println("使用["+getClass().getName()+"]支付");
    }
}
