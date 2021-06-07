package 职责模式;

public class MidFruitSorting extends AbstractFruitSort{
    public MidFruitSorting(int weight)
    {
        super(weight);
    }

    @Override
    protected void pushBox(String fruit) {
        fruitBox.add("水果罐头："+fruit);
    }
}
