package week2robocode;

import java.util.Scanner;

public class E19W2 {
    public static void main(String[] args) {

        System.out.println("Welcome to our comic shop. How much is your comic?");
        Scanner scanner = new Scanner(System.in);
        Integer price = scanner.nextInt();

        System.out.println("How much are you going to pay?");
        Integer moneyPaid = scanner.nextInt();

        Integer change = moneyPaid- price;
        Integer euro = Math.round(change);
        Integer cent = (change*100)% 100;
        System.out.println("Here you are " + euro + "euro and"+ cent+ " cents");

    }
}
