package calculator;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import static org.testng.Assert.assertEquals;

public class TestCalculator {

    @Test
    public void TestAnyNumberTill33Iteratively() {

        // given
        Long[] resultList = new Long[34];
        Long[] expectedList = createExpectedFibonacciList();

        // when
        for (int i = 0; i <= 33; i++) {
            resultList[i] = FibonacciCalculator.calculateIterativelyNumber(i);
        }

        //then
        assertEquals(resultList, expectedList);


    }

    private Long[] createExpectedFibonacciList() {
        Long[] expectedFibonacciList = {0L, 1L, 1L, 2L, 3L, 5L, 8L, 13L, 21L, 34L, 55L, 89L, 144L, 233L, 377L, 610L, 987L, 1597L, 2584L, 4181L, 6765L, 10946L, 17711L, 28657L, 46368L, 75025L, 121393L, 196418L, 317811L, 514229L, 832040L, 1346269L, 2178309L, 3524578L};
        return expectedFibonacciList;
    }

    @Test
    public void TestNumber49and55Iteratively() {

        // given
        SoftAssert softAssert = new SoftAssert();

        // when
        long result49 = FibonacciCalculator.calculateIterativelyNumber(49);
        long result55 = FibonacciCalculator.calculateIterativelyNumber(55);

        // then
        softAssert.assertEquals(result49,7778742049L);
        softAssert.assertEquals(result55,139583862445L);
    }
}







