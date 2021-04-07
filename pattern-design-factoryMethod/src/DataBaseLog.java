public class DataBaseLog implements Log{
    public DataBaseLog()
    {
        writeLog();
    }

    @Override
    public void writeLog() {
        System.out.println("[writeLog]我是："+getClass().getName());
    }
}
