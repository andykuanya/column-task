public class WindowsImp implements ImageImp{
    public void doPaint(Matrix m){
        System.out.println("在["+this.getClass().getName().replaceAll("Imp","")+"]平台上输出["+m.image.getClass().getName().replaceAll("Image","")+"]格式图片");
    }
}
