public class FileLogFactory implements LogFactory{
    public FileLogFactory()
    {
        System.out.println("[createLog]我是："+getClass().getName()+"\n[createLog]正在生产......");
    }

    public Log createLog()
    {
        return new FileLog();
    }
}
