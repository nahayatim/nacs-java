package lecture.groups;

import java.util.*;

public class GroupsApplication {

    public static void main(String[] args) {

        Map<String, List<String>> groups = new HashMap<>();

        groups.put("kitchen", new ArrayList<>(Arrays.asList("omar","tina","tamara")));
        groups.put("learning area", new ArrayList<>(Arrays.asList("rabi","norbert","tamam")));

        List<String> kitchengroup = groups.get("kitchen");

        System.out.println("The kitche group contains:");
        for (String name : kitchengroup) {
            System.out.println(name);
        }
        rotate(groups);


    }

    private static void rotate(Map<String,List<String>>groups){
        List<String> kitchengroup = groups.get("kitchen");

        kitchengroup.remove("omar");
        kitchengroup.add("diba");
        System.out.println("The kitchen group contains: ");
        for (String name : kitchengroup) {
            System.out.println(name);

        }
    }





}
