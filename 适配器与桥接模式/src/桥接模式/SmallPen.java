package 桥接模式;

public class SmallPen extends Pen{
    @Override
    void draw(String object) {
        color.bepaqint("小号钢笔",object);
    }
}
