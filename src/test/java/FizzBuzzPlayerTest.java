import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class FizzBuzzPlayerTest {
    @Test
    public void testFizz() {
        int number = 3;
        String expected = "Fizz";
        String result = FizzBuzzPlayer.fizzBuzz(number);
        assertEquals(result, expected);
    }


    @Test
    public void testBuzz() {
        int number = 5;
        String expected = "Buzz";
        String result = FizzBuzzPlayer.fizzBuzz(number);
        assertEquals(result, expected);
    }


    @Test
    public void testFizzBuzz() {
        int number = 30;
        String expected = "FizzBuzz";
        String result = FizzBuzzPlayer.fizzBuzz(number);
        assertEquals(result, expected);
    }


    @Test
    public void testNormal() {
        int number = 2;
        String expected = "";
        String result = FizzBuzzPlayer.fizzBuzz(number);
        assertEquals(result, expected);
    }


}
