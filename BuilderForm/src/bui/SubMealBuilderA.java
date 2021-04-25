package bui;

public class SubMealBuilderA extends MealBuilder{
    @Override
    public void buildDrink() {
        meal.setDrink("肥仔水");
    }

    @Override
    public void buildFood() {
        meal.setFood("鸡肉卷子");
    }
}
