import operations.*;

import java.util.List;

public class Calculator {

    public static void main(String[] args) {

        ReadingInput readingInput = new ReadingInput();
        Calculator calculator = new Calculator();
        double result = calculator.compute(readingInput.createOperationsList());
        System.out.println(result);
    }

    public double compute(List<Computable> operations) {
        int lastElement = operations.size() - 1;
        double result = operations.get(lastElement).compute(0.0);
        operations.remove(lastElement);
        for (int i = 0; i < operations.size(); i++) {
            result = operations.get(i).compute(result);
        }
        return result;
    }
}