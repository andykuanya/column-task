package 中介者;

public class DiamonMember extends Member{
    public DiamonMember(String name)
    {
        super(name);
    }

    @Override
    public void sendText(String to, String message) {
        System.out.println("钻石会员发消息：");
        chatroom.sendText(name,to,message);
    }

    @Override
    public void sendImage(String to, String image) {
        System.out.println("钻石会员发图片：");
        chatroom.sendText(name,to,image);
    }
}
