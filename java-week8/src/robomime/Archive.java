package robomime;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Archive {
    public void displayUnique(List<String> tricks) {
        Set<String> tricksSet = new HashSet<>(tricks);
        System.out.println("Tricks: " + tricksSet);
        System.out.println("Number of unique tricks: " + tricksSet.size());
    }
}
