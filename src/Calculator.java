import operations.*;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Calculator {

    public static void main(String[] args) {

        List<Computable> operations = new ArrayList<Computable>();
        String filePath = "c:\\git\\storware\\input1.txt";

        try {
            FileReader fileReader = new FileReader(filePath);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            for (String inputLine = bufferedReader.readLine(); inputLine != null; inputLine = bufferedReader.readLine()) {

                String[] splittedInput = inputLine.split(" ");
                String operator = splittedInput[0];
                int value = Integer.parseInt(splittedInput[1]);
                operations.add(createComputation(operator, value));
            }
        } catch (IOException e) {
            System.out.println(e);
        }

        Calculator c = new Calculator();
        double result = c.compute(operations);
        System.out.println(result);
    }

    private static Computable createComputation(String operator, int value) {
        switch (operator) {
            case "add":
                return new Addition(value);
            case "subtrack":
                return new Subtraction(value);
            case "multiply":
                return new Multiplication(value);
            case "divide":
                return new Division(value);
            case "apply":
                return new Apply(value);
        }
        return null;
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