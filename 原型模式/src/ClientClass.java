public class ClientClass {
    public static void main(String[] args) {
        //按照常规的做法得到的两个类是完全一样的
        MyFruit fru1 = new Apple();
        MyFruit fru2 = fru1;
        fru1.Display();
        fru2.Display();
        System.out.println("fru1:"+fru1.hashCode());
        System.out.println("fru2:"+fru2.hashCode());

        //但是原型模式下clone出来的虽然是同样的东西但是实际上是有区别的
        MyFruit fru3 = new Banana();
        MyFruit fru4 = (MyFruit) fru3.clone();
        fru3.Display();
        fru4.Display();
        System.out.println("fru3:"+fru3.hashCode());
        System.out.println("fru4:"+fru4.hashCode());
    }
}
