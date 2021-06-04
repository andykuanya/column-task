public class ClientClass {
    public static void main(String[] args) {
        MyFruit fru1 = new Apple();
        MyFruit fru2 = new Banana();
        MyFruitStore mfs1 = MyFruitStore.GetFruitStore();
        mfs1.Add(1,fru1);
        mfs1.Add(2,fru1);
        mfs1.Add(3,new Apple());
        mfs1.Add(4,new Banana());
        MyFruitStore mfs2 = MyFruitStore.GetFruitStore();

        MyFruit fru = (MyFruit)mfs1.Get(4);
        fru.Display();
        System.out.println("mfs1:"+mfs1.toString());
        System.out.println("mfs2:"+mfs2.toString());
    }
}
