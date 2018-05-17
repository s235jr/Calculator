package operations;

public class Division implements Computable {

    private int value;

    public Division(int value) {
        this.value = value;
    }

    @Override
    public double compute(double input) {
        return input / value;
    }

}
