package operations;

public class Addition implements Computable {

    private int value;

    public Addition(int value) {
        this.value = value;
    }

    @Override
    public double compute(double input) {
        return input + value;
    }
}