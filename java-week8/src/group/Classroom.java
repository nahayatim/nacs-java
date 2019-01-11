package group;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class Classroom {

    private GroupAssigner assigner = new GroupAssigner();

    public List<String> assignGroupsForMonday(List<String> names) {
        return assign(names, n -> n.length() + timesInBathroom(n));
    }

    public List<String> assignGroupsForTuesday(List<String> names) {
        return assign(names, n -> n.length() + timesInBathroom(n) + pieceOfJewelry(n));
    }


    private List<String> assign(List<String> names, Function<String, Integer> formula) {
        List<String> groups = new ArrayList<>();
        for (String name : names) {
            String group = assigner.assign(name,formula );
            groups.add(group);
        }
        return groups;
    }

    private int timesInBathroom(String name) {
        return 2;
    }

    private int pieceOfJewelry(String n) {

        return 3;
    }
}
