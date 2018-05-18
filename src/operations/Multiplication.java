package operations;

public class Multiplication implements Computable {

    private int value;

    public Multiplication(int value) {
        this.value = value;
    }

    @Override
    public double compute(double input) {
        return input * value;
    }
}
