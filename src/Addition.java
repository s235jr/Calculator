public class Addition implements Computable {

    private int value;

    public Addition(int value) {
        this.value = value;
    }

    public double countResult(double input) {
        return input + value;
    }
}