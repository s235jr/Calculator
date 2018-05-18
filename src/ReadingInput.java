import operations.*;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadingInput {

    public List<Computable> createOperationsList() {
        List<Computable> operations = new ArrayList<Computable>();

        String filePath = "c:\\git\\storware\\input1.txt";

        try {
            FileReader fileReader = new FileReader(filePath);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            for (String inputLine = bufferedReader.readLine(); inputLine != null; inputLine = bufferedReader.readLine()) {

                String[] splittedInput = inputLine.split(" ");
                operations.add(createComputation(splittedInput[0], Integer.parseInt(splittedInput[1])));
            }
        } catch (IOException e) {
            System.out.println(e);
        }
        return operations;
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
}