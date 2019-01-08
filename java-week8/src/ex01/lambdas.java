package ex01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class lambdas {
    public static void main(String[] args) {

        List<String> names = new ArrayList<>(Arrays.asList("somewhere", "scenario",
                "table" ,"cable","glass","backpack","mouse"));
        System.out.println(names);

        names.removeIf(e -> e.endsWith("e"));
        System.out.println(names);

        names.replaceAll(e->e.toUpperCase());
        System.out.println(names);

        names.removeIf(e-> e.length()<6);
        System.out.println(names);

        names.forEach(name-> System.out.println(name));
    }
}
