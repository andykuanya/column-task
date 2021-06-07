package 备忘录;

public class OriginatorChess {
    private MementoChess memchess;
    public OriginatorChess(MementoChess mem)
    {
        this.memchess = mem;
    }
    public void setX(int x)
    {
        memchess.setX(x);
    }
    public void setY(int y)
    {
        memchess.setY(y);
    }
    public MementoChess SavetoMemento()
    {
        return new MementoChess(memchess.getLable(),memchess.getX(),memchess.getY());
    }

    public void Show() {
        System.out.println(memchess.getLable()+" ("+memchess.getX()+","+memchess.getY()+")");
    }

    public void Restore(MementoChess mem) {
        memchess = mem;
    }
}
