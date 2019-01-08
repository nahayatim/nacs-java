package exercises.ex03;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumberCorrectorTest {

    NumberCorrector numberCorrector = new NumberCorrector();

    @Test
    void testCorrectNumber(){
        int correct = numberCorrector.correct(-45.6);
        Assertions.assertEquals(45,correct);
    }

}