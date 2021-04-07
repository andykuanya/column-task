import javax.xml.stream.FactoryConfigurationError;
import java.io.FileInputStream;
import java.nio.channels.ScatteringByteChannel;

public class Client {
    public static void main(String[] args) {

        LogFactory factory =(LogFactory) XMLUtil.getBean();

        factory.createLog();
    }
}
