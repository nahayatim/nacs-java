import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Manipulator {

    public String reverse(String text) {
        String[] split = text.split("");
        List<String> letters = new ArrayList<>(Arrays.asList(split));
        Collections.reverse(letters);
        String reversed = "";
        for (String letter : letters) {
            reversed += letter;
        }
        return reversed;
    }

    public int toAscii(String letter) {
        char character = letter.charAt(0);
        int asciiCode = character;
        return asciiCode;
    }

    public String toLetter(int asciiCode) {
        char character = (char) asciiCode;
        return String.valueOf(character);
    }

}
