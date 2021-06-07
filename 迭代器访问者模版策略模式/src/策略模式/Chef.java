package 策略模式;

public class Chef {
    private ICutFruit cutmethod;
    public void setCutmethod(ICutFruit cutmethod)
    {
        this.cutmethod = cutmethod;
    }
    public void cutFruit(String fruitname)
    {
        cutmethod.CutStrategy(fruitname);
    }
}
