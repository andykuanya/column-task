public class BConF implements BFAndV{
    @Override
    public Fruit CreateF() {
        return new Apple();
    }

    @Override
    public Vegetables CreateV() {
        return null;
    }
}
