package bui;

public class SubMealBuilderB extends MealBuilder{
    @Override
    public void buildDrink() {
        meal.setDrink("牛奶");
    }

    @Override
    public void buildFood() {
        meal.setFood("牛肉汉堡");
    }
}
