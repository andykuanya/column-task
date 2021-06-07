package 适配器模式;

import 适配器模式.pro.MyFruit;

public class OldJuicer {
    public String onePort(MyFruit fruit)
    {
        String str = fruit.Get()+"果汁 ";
        return str;
    }
}
