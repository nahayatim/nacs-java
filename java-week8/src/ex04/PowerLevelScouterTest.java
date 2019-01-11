package ex04;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PowerLevelScouterTest {

    private PowerLevelScouter levelScouter = new PowerLevelScouter();


    @Test
    void scout() {

        Integer susanaLvl = levelScouter.scout("Susana");

        int expected = 619;
        assertEquals(expected, susanaLvl);

    }

    @Test
    void scoutEnhanced() {
        Integer susanaLvl = levelScouter.scoutInhaced("Susana");
        int expected = 651;
        assertEquals(expected, susanaLvl);
    }
}
