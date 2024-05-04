package Tests;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import Challenge.FizzBuzz;

public class FizzBuzzTest {

    @Test
    public void testFizzBuzz(){
        assertEquals("FizzBuzz",FizzBuzz.getFizzBuzz(15));
        assertEquals("FizzBuzz", FizzBuzz.getFizzBuzz(30));

        // Test for multiples of 3
        assertEquals("Fizz", FizzBuzz.getFizzBuzz(3));
        assertEquals("Fizz", FizzBuzz.getFizzBuzz(9));

        // Test for multiples of 5
        assertEquals("Buzz", FizzBuzz.getFizzBuzz(5));
        assertEquals("Buzz", FizzBuzz.getFizzBuzz(10));

        // Test for numbers that are not multiples of 3 or 5
        assertEquals("1", FizzBuzz.getFizzBuzz(1));
        assertEquals("2", FizzBuzz.getFizzBuzz(2));
        assertEquals("4", FizzBuzz.getFizzBuzz(4));
    }

}
