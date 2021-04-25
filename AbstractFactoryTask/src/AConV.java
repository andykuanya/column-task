public class AConV implements AFAndV{
    @Override
    public Fruit CreateF() {
        return null;
    }

    @Override
    public Vegetables CreateV() {
        return new Cabbage();
    }
}
