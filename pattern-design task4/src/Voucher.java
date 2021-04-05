public class Voucher implements Pay{
    public Voucher(){
        pay();
    }

    public void pay()
    {
        System.out.println("使用["+getClass().getName()+"]支付");
    }
}
