public class AConF implements AFAndV{
    @Override
    public Fruit CreateF() {
        return new Banana();
    }

    @Override
    public Vegetables CreateV() {
        return null;
    }
}
