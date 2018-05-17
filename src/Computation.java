import operations.Computable;

public class Computation implements Computable {

    private String operator;
    private int value;

    public Computation(String operator, int value) {
        this.operator = operator;
        this.value = value;
    }

    public Computation() {
    }

    public double compute(double input) {

        switch (operator) {
            case "subtrack":
                return input - value;
            case "divide":
                return input / value;
            case "apply":
                    return value;
            default:
                //throw new Exception();
                return 0.0;
        }

    }
}