package testing;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ReverserTest {

    private Reverser reverser = new Reverser();



    @Test
    void testNormalText() {
        String text = "intake4 is the best.";
        String reversed = reverser.reverse(text);
        //System.out.println(reversed);
        Assertions.assertEquals(".tseb eht si 4ekatni",reversed);

    }

    @Test
    void testEmptyText(){
        String text ="";
        String reversed = reverser.reverse(text);
        Assertions.assertEquals("",reversed);

    }

    @Test
    void testNoText(){
        String text = null;
        String reversed = reverser.reverse(text);
        Assertions.assertEquals("",reversed);
    }
}