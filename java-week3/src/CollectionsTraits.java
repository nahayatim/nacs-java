import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsTraits {
    public static void main(String[] args) {

        List<String> names = getNames();
        System.out.println("original: "+names);

        names = getNames();
        Collections.reverse(names);
        System.out.println("reverse: "+ names);

        names = getNames();
        Collections.rotate(names,1);
        System.out.println("rotate 1 right: "+names);

        names = getNames();
        Collections.rotate(names,-1);
        System.out.println("rotate 1 left: "+names);

        names = getNames();
        Collections.sort(names);
        System.out.println("sort alphabeticaly: "+ names);

        names = getNames();
        Collections.shuffle(names);
        System.out.println("shuffle: "+names);

    }


    private static List<String> getNames() {
        List<String>names = new ArrayList<>();
        names.add("lisa");
        names.add("Mona");
        names.add("Sam");
        names.add("Anton");
        return names;


    }
}
