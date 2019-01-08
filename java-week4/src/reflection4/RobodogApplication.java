package reflection4;

//read the robodog.txt file, decrypt its lines into instructions, figure out
//the unique instructions, display how many there are and which ones are there.
//figure out how many times each instruction is used, and afterwards display
//the one that is used the most.



import ex09.FileReader;

import java.util.*;

public class RobodogApplication {

    public static void main(String[] args) {

        // read all lines
        FileReader reader = new FileReader();
        List<String> lines = reader.asLines("reflection4/robodog.txt");

        // transform lines into instructions - put away the "!"s
        List<String>instructions = new ArrayList<>();
        for (String line : lines) {
            String replaced = line.replaceAll("!", "");
            instructions.add(replaced);
        }

        // find unique instructions
        Set<String> unique = new HashSet<>(instructions);
        System.out.println("Number of unique instructions: "+ unique.size());
        System.out.println("Commands: "+ unique);

        // display: how many, which ones
        // figure out frequencies
        // figure out most appearing instruction
        // display
        displayFrequencyAndMostAppearing(instructions);

    }

    private static void displayFrequencyAndMostAppearing(List<String> instructions) {
        Map<String, Integer> frequencies = new HashMap<>();
        for (String instruction : instructions) {
            if (!frequencies.containsKey(instruction)){
                frequencies.put(instruction,new Integer(0));
            }
            Integer times = frequencies.get(instruction);
            frequencies.put(instruction, times+1);

        }
        System.out.println("Frequency: "+ frequencies);

        Set<Map.Entry<String, Integer>> entries = frequencies.entrySet();
        List <Map.Entry<String, Integer>> sorted = new ArrayList<>(entries);
        Collections.sort(sorted,Comparator.comparing(Map.Entry::getValue));
        Collections.reverse(sorted);
        Map.Entry<String, Integer> mostAppearing = sorted.get(0);

        System.out.println("Most used command: "+mostAppearing.getKey() +" | "+ mostAppearing.getValue()+" times");

    }
}
