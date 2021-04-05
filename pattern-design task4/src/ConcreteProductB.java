public class ConcreteProductB implements Product{
    public ConcreteProductB(){
        show();
    }
    public void show()
    {
        System.out.println("生成产品的型号是"+getClass().getName());
    }
}
