public class Computation implements Computable {

    private String operator;
    private int value;

    public Computation(String operator, int value) {
        this.operator = operator;
        this.value = value;
    }

    public Computation() {
    }

    public double countResult(double input) {
        return input;
    }
}