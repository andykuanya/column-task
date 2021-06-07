package 备忘录;

public class MementoChess {
    private String label;
    private int x,y;

    public MementoChess(String label, int x, int y)
    {
        this.label = label;
        this.x = x;
        this.y = y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public String getLable() {
        return label;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
