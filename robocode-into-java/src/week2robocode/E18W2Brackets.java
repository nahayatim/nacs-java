package week2robocode;

import java.util.Scanner;

public class E18W2Brackets {

    public static void main(String[] args) {

        System.out.println("give me a word");
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();

        Integer size= word.length();
        String upperCase = word.toUpperCase();
        char firstletter= upperCase.charAt(0);
        char lastletter= upperCase.charAt(size - 1);
        String middle = upperCase.substring(1, size - 1);
         middle = middle.toLowerCase();
        String Word= firstletter + middle + lastletter;


        System.out.println(Word);

    }


}
