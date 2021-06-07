package 中介者;

public class Client {
    public static void main(String[] args) {
        AbstractChatroom happyChat = new ChatGroup();
        Member member1, member2, member3, member4;
        member1 = new DiamonMember("黄明欢");
        member2 = new CommonMember("肥仔昆昆");
        member3 = new CommonMember("郭子航");
        member4 = new CommonMember("爱吹笛子的颠佬");

        happyChat.register(member1);
        happyChat.register(member2);
        happyChat.register(member3);
        happyChat.register(member4);

        member1.sendText("肥仔昆昆","肥仔中午去吃什么？");
        member2.sendText("黄明欢","随便，鸭腿饭吧");
        member3.sendText("黄明欢","哥哥的胸大肌怎么样？");
        member1.sendText("爱吹笛子的颠佬","午觉时间禁止吹笛子");
    }
}
