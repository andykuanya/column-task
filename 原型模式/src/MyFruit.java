public class MyFruit implements Cloneable{
    protected String kind;
    //克隆方法
    public Object clone()
    {
        Object obj = null;
        //防止不支持克隆当前对象的话返回异常
        try
        {
            obj = super.clone();
        } catch (CloneNotSupportedException e)
        {
            e.printStackTrace();
        }
        return obj;
    }

    //另一个方法
    public void Display(){
        System.out.println(kind);
    }
}
