package 桥接模式;

public class Grey implements Color{
    @Override
    public void bepaqint(String penType, String name) {
        System.out.println("使用"+penType+"画了灰色的"+name);
    }
}
