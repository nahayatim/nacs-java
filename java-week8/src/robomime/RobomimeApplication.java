package robomime;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RobomimeApplication {
    public static void main(String[] args) {
        Archive archive = new Archive();
        FileReader reader = new FileReader();
        List<String> lines = reader.asLines("robomime/robomime.txt");
        List<String> tricks = new ArrayList<>();
        Sensor sensor = new Sensor();
        for (String line : lines) {
            String decrynpted = sensor.decrypt(line);
            tricks.add(decrynpted);
        }

//        List<String> tricks =sensor.decrypt(lines);
            archive.displayUnique(tricks);
       }




    // System.out.println(tricks);
//        archive.
}
