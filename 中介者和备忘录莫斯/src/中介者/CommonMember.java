package 中介者;

public class CommonMember extends Member{

    public CommonMember(String name)
    {
        super(name);
    }

    @Override
    public void sendText(String to, String message) {
        System.out.println("普通会员发消息：");
        chatroom.sendText(name,to,message);
    }

    @Override
    public void sendImage(String to, String image) {
        System.out.println("普通会员发图片：");
        chatroom.sendText(name,to,image);
    }
}
