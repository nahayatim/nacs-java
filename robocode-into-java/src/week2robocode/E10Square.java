package week2robocode;

import java.util.Scanner;

public class E10Square {

    public static Integer calculateSquare (Integer number) {
        Integer square = number * number;
        return square;
    }

    public static void main(String[] args) {
        System.out.println("Give me the first number");
        Scanner scanner = new Scanner(System.in);
        Integer number1 = scanner.nextInt();
        Integer squareResult = calculateSquare (number1);
        System.out.println("the result is " + squareResult);

       /* System.out.println("Give me the second number");
        Integer number2 = scanner.nextInt();
        Integer squareResult = calculateSquare(number2);
        System.out.println("the result is " + squareResult);*/


    }

}
