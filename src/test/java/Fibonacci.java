import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


// Starting numbers -> 0, 1
// 0+ 1 =1
// 0, 1, 1, 2, 3, 5, 8, 13, 21
public class Fibonacci {

    private int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
    return fibonacci(n-1) + fibonacci(n-2);
}


    @Test
    void fibonacciTest() {
        assertEquals(0, fibonacci(0));
        assertEquals(1, fibonacci(1));
        assertEquals(1, fibonacci(2));
        assertEquals(2, fibonacci(3));
        assertEquals(3, fibonacci(4));
        assertEquals(5, fibonacci(5));
    }
}
