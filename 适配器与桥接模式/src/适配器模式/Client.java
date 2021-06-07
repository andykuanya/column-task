package 适配器模式;

import 适配器模式.pro.Apple;
import 适配器模式.pro.Banana;
import 适配器模式.pro.MyFruit;
import 适配器模式.pro.Orange;

public class Client {
    public static void main(String[] args) {
        MyFruit fru1 = new Apple();
        MyFruit fru2 = new Banana();
        MyFruit fru3 = new Orange();

        InewJuicer newJuicer = new Adapter();
        System.out.println("[新果汁机]"+newJuicer.newPort(fru1,fru2,fru3));
    }
}
