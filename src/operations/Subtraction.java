package operations;

public class Subtraction implements Computable{

    private int value;

    public Subtraction(int value) {
        this.value = value;
    }

    @Override
    public double compute(double input) {
        return input - value;
    }
}
