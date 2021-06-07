package 桥接模式;

public abstract class Pen {
    protected Color color;
    void setColor(Color color)
    {
        this.color = color;
    }
    abstract void draw(String object);
}
