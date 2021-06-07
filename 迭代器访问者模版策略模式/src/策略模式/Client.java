package 策略模式;

public class Client {
    public static void main(String[] args) {
        Chef chef = new Chef();
        ICutFruit cut = new MultiBlade();
        chef.setCutmethod(cut);
        chef.cutFruit("一百斤的榴莲");
    }
}
