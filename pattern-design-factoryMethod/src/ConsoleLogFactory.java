public class ConsoleLogFactory implements LogFactory{
    @Override
    public Log createLog() {
        System.out.println("[createLog]我是："+getClass().getName()+"\n[createLog]正在生产......");
        return new ConsoleLog();
    }
}
