package exercises.ex06;

//Create the WardrobeBuilderTest class to make sure the build method returns
//a proper wardrobe. For this you will need the getParts method in the
//Wardrobe class.
//In order to create a meaningful test, create a list of string manually
//with exactly the right parts in the right order. Then you can test that
//both lists have the same size and that they are exactly the same.
//A more dynamic way to do it would be to place the parts of the wardrobe
//in a map, counting how many of each are there, and then you check that
//it is indeed the right amount for each part.


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class WardrobeBuilderTest {

    private WardrobeBuilder builder = new WardrobeBuilder();

    @Test
    void build(){
        String parts= "bottom, side, side, back, top, shelf, shelf, shelf, shelf, shelf, shelf, shelf, shelf, door, door";
        String[] split = parts.split(", ");
        List<String> steps = Arrays.asList(split);

        Wardrobe warderobe = builder.build();

        List<String> warderobeParts = warderobe.getParts();

        Assertions.assertEquals(steps,warderobeParts);
    }

}