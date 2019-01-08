package exercises.ex05;

import java.util.Scanner;

public class CreditCardApplication {
    public static void main(String[] args) {

        System.out.println("Enter card Number = ");
        Scanner scanner = new Scanner(System.in);
        String cardNumber = scanner.nextLine();

        ValidationCheck validationCheck = new ValidationCheck();
        String result = validationCheck.check(cardNumber);
        System.out.println(result);


    }
}
