public class Addition extends Computation implements Computable {

    private int value;

    public Addition(int value) {
        ;
        this.value = value;
    }

    public Addition() {
    }


    public double countResult(double input) {

        return input + value;
    }
}
