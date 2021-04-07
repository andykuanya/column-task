public class DataBaseLogFactory implements LogFactory{
    public DataBaseLogFactory()
    {
        System.out.println("[createLog]我是："+getClass().getName()+"\n[createLog]正在生产......");
    }
    @Override
    public Log createLog() {
        return new DataBaseLog();
    }
}
