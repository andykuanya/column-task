package 命令模式;

import java.util.ArrayList;

public class WaitorInvoker {
    private ArrayList<Command> commands=null;

    public WaitorInvoker()
    {
        commands = new ArrayList<Command>();
    }
    public void SetCommand(Command cmd)
    {
        commands.add(cmd);
    }
    public void OrderUp()//对所有命令进行发布
    {
        System.out.println("有订单来惹~");
        for(Command cmd:commands)
        {
            if(cmd!=null)
                cmd.execute();
        }
    }
}
