package 桥接模式;

public class BigPen extends Pen{
    @Override
    void draw(String object) {
        color.bepaqint("大号钢笔",object);
    }
}
