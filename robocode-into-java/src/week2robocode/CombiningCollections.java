package week2robocode;

import java.util.ArrayList;
import java.util.List;

public class CombiningCollections {
    public static void main(String[] args) {
        List<String>one= getCollection1();
        List<String>two= getCollection2();

        System.out.println(one);
        System.out.println(two);

        List<String>combination= combine(one,two);

        System.out.println(combination);

    }

    private static List<String> getCollection1(){
        List<String>names= new ArrayList<>();
        names.add("dog");
        names.add("cat");
        names.add("bird");
        return names;
    }
    private static List<String> getCollection2(){
        List<String>names= new ArrayList<>();
        names.add("table");
        names.add("chair");
        names.add("lamp");
        return names;
    }

    private static List<String>combine(List<String>one,List<String>two){
        List<String>combination= new ArrayList<>();
        while (areThereElementIn(one,two)){
            transfer(one,combination);
            transfer(two,combination);
        }
        return combination;
    }

    private static boolean areThereElementIn(List<String>one,List<String>two){
        return !one.isEmpty() || !two.isEmpty();
    }

    private static void transfer(List<String>origin,List<String>destination){
        if (origin.isEmpty()){
            return;
        }
        String firstElement= origin.get(0);
        origin.remove(0);
        destination.add(firstElement);
    }


}
