package 命令模式;

public class Client {
    public static void main(String[] args) {
        //创建订单
        Order order1 = new Order();
        order1.setId(1);
        order1.setFruitmap("新居",1);
        order1.setFruitmap("火龙ger",2);
        order1.setFruitmap("贫古",3);

        Order order2 = new Order();
        order2.setId(2);
        order2.setFruitmap("鸡米花",1);
        order2.setFruitmap("区块链",2);
        order2.setFruitmap("牛奶",3);

        Order order3 = new Order();
        order3.setId(3);
        order3.setFruitmap("葡萄",1);
        order3.setFruitmap("焦黄",2);
        order3.setFruitmap("迷hotel",3);
        //创建操作者
        Operator op = new Operator();
        //将多个订单封装成命令对象
        OrderCommand cmd1 = new OrderCommand(op,order1);
        OrderCommand cmd2 = new OrderCommand(op,order2);
        OrderCommand cmd3 = new OrderCommand(op,order3);
        //创建调用者并添加命令
        WaitorInvoker waitor = new WaitorInvoker();
        waitor.SetCommand(cmd1);
        waitor.SetCommand(cmd2);
        waitor.SetCommand(cmd3);
        //执行命令
        waitor.OrderUp();
    }
}
