import java.io.FileInputStream;
import java.util.Properties;

public class Test {
    public static void main(String[] args) {
        FileInputStream fs;
        Properties properties = new Properties();
        try {
            fs = new FileInputStream("src\\config.xml");
            properties.load(fs);
            fs.close();
            FAndV ff =(FAndV) Class.forName(properties.getProperty("ConF")).newInstance();
            FAndV vv =(FAndV) Class.forName(properties.getProperty("ConV")).newInstance();
            Fruit f;
            Vegetables v;
            f=ff.CreateF();
            v=vv.CreateV();
            f.eat();
            v.eat();
        }catch (Exception e)
        {

        }
    }
}
