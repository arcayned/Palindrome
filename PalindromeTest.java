import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PalindromeTest {

    @Test
    public void testAIsPalindrome() {
        assertTrue(Palindrome.isPalindrome("a"));
    }

    @Test
    public void testEmptyStringIsPalindrome() {
        assertTrue(Palindrome.isPalindrome(""));
    }
    
    @Test
    public void testMadamIsPalindrome() {
        assertTrue(Palindrome.isPalindrome("madam"));
    }

    @Test
    public void testJavaIsNotPalindrome() {
        assertFalse(Palindrome.isPalindrome("java"));

    }

    @Test
public void testRacecarUppercaseIsPalindrome() {
    assertTrue(Palindrome.isPalindrome("Racecar"));
     }

    @Test
public void testRacecarWithSpacesIsPalindrome() {
    assertFalse(Palindrome.isPalindrome("Racecar "));
    }

    @Test
public void testRacecarWithMiddleSpaceIsPalindrome() {
    assertFalse(Palindrome.isPalindrome("Race car"));
    }
    
}



