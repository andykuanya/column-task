package 装饰模式;

public class Client {
    public static void main(String[] args) {
        IBirthdayCake birthdayCake = new Cake();
        birthdayCake.show();

        Cream cream = new Cream(birthdayCake);
        cream.PutCream();
        cream.show();

        Fruit fruit = new Fruit(birthdayCake);
        fruit.PutFruit();
        fruit.show();
    }
}
