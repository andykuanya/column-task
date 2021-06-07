package 桥接模式;

public class Client {
    public static void main(String[] args) {
        Color color1,color2;
        Pen pen1,pen2;

        color1 = new Black();
        color2 = new Yellow();
        pen1 = new BigPen();
        pen2 = new SmallPen();

        pen1.setColor(color1);
        pen1.draw("猪头饼");
        pen1.setColor(color2);
        pen1.draw("猪头饼");
        pen2.setColor(color1);
        pen2.draw("猪头饼");
        pen2.setColor(color2);
        pen2.draw("猪头饼");
    }
}
