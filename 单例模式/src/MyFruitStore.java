import java.util.Hashtable;

public class MyFruitStore {
    //懒汉式（当前使用：等系统需要的时候再创建
    //饥饿式：系统一启动就new一个MyFruitStore，只要用到他都在，不需要再创建
    private static Hashtable fruittable = null;
    private static MyFruitStore fruitstore = null;

    private MyFruitStore()
    {
        fruittable = new Hashtable<Integer, MyFruit>();
    }
    public static MyFruitStore GetFruitStore()
    {
        if(fruittable==null)
        {
            fruitstore = new MyFruitStore();
        }
        return fruitstore;
    }
    public void Add(Integer key, MyFruit fruit)
    {
        fruittable.put(key,fruit);
    }
    public Object Get(Integer key)
    {
        Object obj = null;
        if(fruittable.containsKey(key))
            obj = fruittable.get(key);
        return obj;
    }
    public Object Get(MyFruit fruit)
    {
        Object obj = null;
        if(fruittable.containsValue(fruit))
            obj = fruittable.get(fruit);
        return obj;
    }
}
