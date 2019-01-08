package ex05;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Palindrome {

    public Boolean checkPalindrome(String text) {
        String reversedText = "";

        text = text.replaceAll(" ", "");
        String originalText = text;

        String[] splited = text.split("");

        int lastPosition = splited.length - 1;

        for (int position = lastPosition; position > 0; position--) {
            reversedText +=splited[position];

        }
        return originalText.equalsIgnoreCase(reversedText);
    }
}
