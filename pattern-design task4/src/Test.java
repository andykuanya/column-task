import java.io.FileInputStream;
import java.util.Properties;

public class Test {
    public static void main(String[] args) {
        try
        {
            //读文件
            FileInputStream fs = new FileInputStream("src\\config.tld");
            fs.read();
            Properties properties = new Properties();
            properties.load(fs);
            fs.close();

            //调用静态工厂方法
            Factory.factoryMethod(properties.getProperty("productName"));
            Factory.factoryMethod2(properties.getProperty("paymentName"));
        }catch (Exception e)
        {
            System.out.println("文件读取出错");
        }
    }
}
