package binariks.training.hometask;


public class Fibonacci {
    public static int fib(int n) {

        if ((n == 1) || (n == 2)) {
            return 1;
        } else {
            int result = fib(n - 1) + fib(n - 2);
            return result;
        }
    }

    private static  int[] precalculated = null;

    public static int fib2(int n) {



        if (precalculated == null) {
            initPrecalculatedArray(n);
        }
        if (precalculated[n - 1] != -1) {
            return precalculated[n - 1];
        } else {
            int result = fib2(n - 1) + fib2(n - 2);
            precalculated[n - 1] = result;
            return result;
        }
    }

    private static void initPrecalculatedArray(int size) {
        precalculated = new int[size];
        for (int i = 0; i < precalculated.length; i++) {
            precalculated[i] = -1;
            precalculated[0] = 1;
            precalculated[1] = 1;


        }
    }
}




