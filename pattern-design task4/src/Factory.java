import java.io.FileInputStream;

public class Factory {
    public static Product factoryMethod(String arg)
    {
        try
        {
            System.out.println("正在生产......");
            Product product=null;
            Class cls = Class.forName(arg);
            product = (Product)cls.newInstance();
            return product;
        }catch (Exception e)
        {
            System.out.println("找不到相应产品，检查输入的产品名是否正确");
        }
        return null;
    }

    public static Pay factoryMethod2(String arg)
    {
        try
        {
            System.out.println("正在选择支付方式......");
            Pay pay=null;
            Class cls = Class.forName(arg);
            pay = (Pay)cls.newInstance();
            return pay;
        }catch (Exception e)
        {
            System.out.println("找不到相应支付方式，检查输入的支付方式名是否正确");
        }
        return null;
    }
}
