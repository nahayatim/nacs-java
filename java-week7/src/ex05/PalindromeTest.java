package ex05;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalindromeTest {

    Palindrome palindrome = new Palindrome();

    @Test
    void checkPalindrome() {

        boolean answer = palindrome.checkPalindrome("mahtab");
        Assertions.assertFalse(answer);
    }
}