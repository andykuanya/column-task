package 桥接模式;

public class MiddlePen extends Pen{
    @Override
    void draw(String object) {
        color.bepaqint("中号钢笔",object);
    }
}
