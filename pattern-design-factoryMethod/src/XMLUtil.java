import java.io.FileInputStream;
import java.util.Properties;


public class XMLUtil {
    public static Object getBean()
    {
        try
        {
            FileInputStream fs = new FileInputStream("src\\config.xml");
            fs.read();
            Properties properties = new Properties();
            properties.load(fs);
            fs.close();
            Class cls = Class.forName(properties.getProperty("ClassName"));
            return cls.newInstance();
        }
        catch (Exception e)
        {
            System.out.println("文件读取失败");
            return null;
        }
    }
}
