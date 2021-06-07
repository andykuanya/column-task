package 中介者;

public abstract class Member {
    protected String name;
    protected AbstractChatroom chatroom;

    public Member(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return name;
    }

    public void setChatroom(AbstractChatroom chatroom)
    {
        this.chatroom = chatroom;
    }

    public abstract void sendText(String to,String message);
    public abstract void sendImage(String to,String image);

    public void receiveText(String from, String message)
    {
        System.out.println(from+" 发送文本给 "+name+"内容为："+message);
    }

    public void receiveImage(String from, String image)
    {
        System.out.println(from+" 发图片给 "+name+"内容为："+image);
    }
}
