package group;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ClassroomTest {

    private Classroom classroom= new Classroom();

    @Test
    void assignGroupsForMonday() {
        List<String>names = Arrays.asList("mahtab","Diba","sahar");
        List<String> groups = classroom.assignGroupsForMonday(names);
        for (int position=0; position<names.size();position++) {
            String name = names.get(position);
            String group = groups.get(position);
            System.out.println(name+ " goes to "+group);
        }
    }

    @Test
    void assignGroupsForTuesday() {
    }
}