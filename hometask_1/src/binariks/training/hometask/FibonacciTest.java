package binariks.training.hometask;

import org.junit.Test;

import static org.junit.Assert.*;

public class FibonacciTest {
    @Test
    public void testFib() {
        int answer = Fibonacci.fib(46);
        int correct = 1836311903;
        assertEquals(answer, correct);
    }

    @Test
    public void testFib2() {
        int answer = Fibonacci.fib(46);
        int correct = 1836311903;
        assertEquals(answer, correct);
    }
}
