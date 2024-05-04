package Tests;

import Challenge.StringReverser;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringReverserTest {
    @Test
    public void testReverseWordsNormalSentence() {
        String input = "Hello world this is Java";
        String expected = "Java is this world Hello";
        assertEquals(expected, StringReverser.reverseWords(input));
    }

    @Test
    public void testReverseWordsSingleWord() {
        String input = "Java";
        String expected = "Java";
        assertEquals(expected, StringReverser.reverseWords(input));
    }

    @Test
    public void testReverseWordsEmptyString() {
        String input = "";
        String expected = "";
        assertEquals(expected, StringReverser.reverseWords(input));
    }

    @Test
    public void testReverseWordsMultipleSpaces() {
        String input = "Hello   world  this   is    Java";
        String expected = "Java is this world Hello";
        assertEquals(expected, StringReverser.reverseWords(input));
    }

    @Test
    public void testReverseWordsAllSpaces() {
        String input = "     ";
        String expected = "";
        assertEquals(expected, StringReverser.reverseWords(input));
    }
}
