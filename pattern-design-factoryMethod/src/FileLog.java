public class FileLog implements Log{

    public FileLog()
    {
        writeLog();
    }

    @Override
    public void writeLog() {
        System.out.println("[writeLog]我是："+getClass().getName());
    }
}
