public class BConV implements BFAndV{
    @Override
    public Fruit CreateF() {
        return null;
    }

    @Override
    public Vegetables CreateV() {
        return new Tomato();
    }
}
