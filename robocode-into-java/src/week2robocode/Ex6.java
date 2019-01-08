package week2robocode;

import java.util.Scanner;

public class Ex6 {

     public static void main(String[] args) {

         Integer number1 = getNumber("Tell me the number1");
         Integer number2 = getNumber("Tell me the number2");

         Integer sum = number1 + number2;
         System.out.println("The sum is:" + sum);
    }

    private static Integer getNumber(String message) {
          Scanner scanner = new Scanner(System.in);
          System.out.println(message);
          return scanner.nextInt();
    }
}
