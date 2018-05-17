package operations;

public class Apply implements Computable {

    private int value;

    public Apply(int value) {
        this.value = value;
    }

    @Override
    public double compute(double input) {
        return value;
    }
}