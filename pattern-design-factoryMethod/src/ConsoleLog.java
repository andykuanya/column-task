public class ConsoleLog implements Log{
    public ConsoleLog()
    {
        writeLog();
    }

    @Override
    public void writeLog() {
        System.out.println("[writeLog]我是："+getClass().getName());
    }
}
