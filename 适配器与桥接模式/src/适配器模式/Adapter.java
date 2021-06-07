package 适配器模式;

import 适配器模式.pro.MyFruit;

public class Adapter extends OldJuicer implements InewJuicer{
    private OldJuicer oldJuicer = new OldJuicer();

    public String newPort(MyFruit...x)
    {
        String str = "1混合果汁由{";
        for(MyFruit i:x)
            str += onePort(i);
        str+="}组成";
        return str;
    }
}
