package telran.util;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static telran.util.RecursionMethods.*;

public class RecursionMethodsTest {
    // @Test
    // void ftest() {
    //     f(400);
    // }
    // @Test
    // void factorialTest() {
    //     assertEquals(6, factorial(3));
    //     assertEquals(24, factorial(4));
    //     assertEquals(6, factorial(-3));
    // }
    @Test
    void powTest() {
        // assertEquals(100, pow(10, 2));
        assertEquals(100, pow(-10, 2));
        // assertEquals(1000, pow(10, 3));
        // assertEquals(-1000, pow(-10, 3));
        // assertThrowsExactly(IllegalArgumentException.class, () -> pow(10, -3));
    }
    @Test
    void sumTest() {
        int[] ar = {1, 2, 3, 4, 5};
        assertEquals(15, sum(ar));
    }
    @Test
    void squareTest() {
        assertEquals(0, square(0));
        assertEquals(1, square(1));
        assertEquals(4, square(2));
        assertEquals(9, square(3));
        assertEquals(1, square(-1));
        assertEquals(4, square(-2));
        assertEquals(9, square(-3));
        assertEquals(100, square(10));
        assertEquals(100, square(-10));
    }

    @Test
    void isSubstringTest() {
        assertEquals(true, isSubstring("", ""));
        assertEquals(false, isSubstring("", "telran"));
        assertEquals(true, isSubstring("telran", ""));
        assertEquals(true, isSubstring("tel ran", "tel"));
    }
}
