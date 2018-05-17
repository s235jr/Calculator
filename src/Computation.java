import java.util.List;

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

        switch (operator) {
            case "add":
                return input + value;
            case "subtrack":
                return input - value;
            case "divide":
                return input / value;
            case "multiply":
                return input * value;
            case "apply":
                    return value;
            default:
                //throw new Exception();
                return 0.0;
        }

    }
}