
import junit.framework.Assert;
import operations.*;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

class CalculatorTest {

    @Test
    void countResult1() {
        List<Computable> computationList = new ArrayList<Computable>();
        computationList.add(new Addition(2));
        computationList.add(new Multiplication(3));
        computationList.add(new Apply( 10));

        Calculator c = new Calculator();
        double result = c.compute(computationList);
        Assert.assertEquals(36.0, result);
    }

    @Test
    void countResult2() {

        List<Computable> computationList = new ArrayList<Computable>();
        computationList.add(new Multiplication(3));
        computationList.add(new Addition(2));
        computationList.add(new Apply( 10));

        Calculator c = new Calculator();
        double result = c.compute(computationList);
        Assert.assertEquals(32.0, result);
    }

    @Test
    void countResult3() {
        List<Computable> computationList = new ArrayList<Computable>();
        computationList.add(new Apply( 10));

        Calculator c = new Calculator();
        double result = c.compute(computationList);
        Assert.assertEquals(10.0, result);
    }
}
