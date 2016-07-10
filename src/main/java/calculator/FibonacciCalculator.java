package calculator;

public class FibonacciCalculator {

    public static long calculateIterativelyNumber(int number) {
        long a = 0L;
        long b = 1L;
        long temp = 0L;
        if(number == 0){
            return a;
        }
        if(number == 1){
            return b;
        }
        for (int i = 2; i <= number; i++) {
            temp = b;
            b += a;
            a = temp;
        }
        return b;
    }

    public static Long calculateRecursivelyNumber(int number) {
        if (number==0){
            return 0L;
        }
        if (number==1){
            return 1L;
        }
        return calculateRecursivelyNumber(number-2)+calculateRecursivelyNumber(number-1);
    }
}
