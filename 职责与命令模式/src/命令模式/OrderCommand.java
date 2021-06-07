package 命令模式;

public class OrderCommand implements Command{
    private Operator receiver;
    private Order order;
    //放两个参数，一个是执行者，一个是执行目标
    public OrderCommand(Operator receiver,Order order)
    {
        this.receiver = receiver;
        this.order = order;
    }
    public void execute()
    {
        System.out.println(order.getId()+"号顾客的菜");
        receiver.MarkFruit(order);
    }
}
