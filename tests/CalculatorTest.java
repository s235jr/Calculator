
import junit.framework.Assert;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

class CalculatorTest {


    @Test
    void countResult1() {
        List<Computable> computationList = new ArrayList<Computable>();
        computationList.add(new Computation("add", 2));
        computationList.add(new Computation("multiply", 3));

        computationList.add(new Computation("apply", 10));


        Calculator c = new Calculator();
        double result = c.compute(computationList);
        Assert.assertEquals(36.0, result);
    }

    @Test
    void countResult2() {

        List<Computable> computationList = new ArrayList<Computable>();
        computationList.add(new Computation("multiply", 3));
        computationList.add(new Computation("add", 2));
        computationList.add(new Computation("apply", 10));

        Calculator c = new Calculator();
        double result = c.compute(computationList);
        Assert.assertEquals(32.0, result);
    }

    @Test
    void countResult3() {
        List<Computable> computationList = new ArrayList<Computable>();
        computationList.add(new Computation("apply", 10));

        Calculator c = new Calculator();
        double result = c.compute(computationList);
        Assert.assertEquals(10.0, result);
    }
}
