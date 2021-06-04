package 组合模式;

public class Client {
    public static void main(String[] args) {
        MyElement e1 = new Apple();
        MyElement e2 = new Banana();
        MyElement e3 = new Pear();
        Plate p1,p2;

        System.out.println("--------P1-----------");
        p1 = new Plate();
        p1.Add(e1);
        p1.Add(e3);
        p1.eat();

        System.out.println("--------P2-----------");
        p2 = new Plate();
        p2.Add(e1);
        p2.Add(e2);
        p2.Add(e3);
        p2.eat();
    }
}
