package reflection8;

import ex04.PowerLevelScouter;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ThermostatTest {

    private Thermostat thermostat = new Thermostat(s -> s < 0, l -> l + "degrees Celsius");
    private Thermostat thermostat2 = new Thermostat(s -> s >= 80, t -> t + 273.15 + "degrees kelvin");

    @Test
    void skiing() {
        Double temperture = 2.0;
        Double temperture2 = -1.0;

        String actual = thermostat.sense(temperture);
        String expected = temperture + "degrees Celsius";

        Assertions.assertEquals(expected, actual);

        actual = thermostat.sense(temperture2);
        expected = temperture2 + "degrees Celsius";

    }

    @Test
        void testSauna(){
            Double temprature = 79.0;
            Double temprature2 = 80.0;

        String actual = thermostat2.sense(temprature);
        String expected=temprature+"degrees kelvin";

        Assertions.assertEquals(expected,actual);


    }
}