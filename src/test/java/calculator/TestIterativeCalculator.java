package calculator;

import org.testng.annotations.Test;
import static org.testng.Assert.*;
public class TestIterativeCalculator {

    @Test
    public void TestNumber49() {

        // given and when
        long result = FibonacciCalculator.calculateIterativelyNumber(49);
        
        //then
        assertEquals(result,7778742049L);
        

    }
}
