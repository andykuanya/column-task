package 职责模式;

public class BigFruitSorting extends AbstractFruitSort{
    public BigFruitSorting(int weight)
    {
        super(weight);
    }
    @Override
    protected void pushBox(String fruit) {
        fruitBox.add("超市："+fruit);
    }
}
