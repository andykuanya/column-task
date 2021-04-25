package bui;

public class Test {
    public static void main(String[] args) {
        MealBuilder mb;
        KFCWaiter waiter = new KFCWaiter();
        waiter.setMb(new SubMealBuilderA());
        waiter.construct();
        System.out.println("Food："+waiter.mb.meal.getFood()+"\tDrink："+waiter.mb.meal.getDrink());
    }
}
