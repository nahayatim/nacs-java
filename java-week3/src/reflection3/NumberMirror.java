package reflection3;

//The NumberMirror has the mirror method that receives a number and returns it
//written backwards.
//Add the specialMirror method to the NumberMirror class that receives a number
//and returns the special mirror version of it.
//add 1 to every number before they write them backwards. If the number is 9
//then they just write a 0.



import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class NumberMirror {

    public Integer mirror(Integer number){
        List<String> numbers = seperate(number);
        Collections.reverse(numbers);
        String reversed = String.join("", numbers);
        return Integer.valueOf(reversed);
    }

    private List<String> seperate(Integer number) {
        String string = number.toString();
        String[] split = string.split("");
        List<String> immutableNumbers = Arrays.asList(split);
        List<String> mutableNumbers = new ArrayList<>(immutableNumbers);
        return mutableNumbers;
    }



    public Integer specialMirror(Integer number){
        List<String>numbers = seperate(number);
        numbers = addPlusOneToAll(numbers);
        Collections.reverse(numbers);
        String reversed = String.join("",numbers);
        return Integer.valueOf(reversed);
    }

    private List<String> addPlusOneToAll(List<String> numbers) {
        List<String> modified = new ArrayList<>();
        for (String number : numbers) {
           addPlusOne(number,modified);
        }
        return modified;

    }

    private void addPlusOne(String number, List<String> modified) {
        Integer digit = Integer.valueOf(number);
        Integer result = (digit + 1) % 10;
        modified.add(result.toString());
    }


}
