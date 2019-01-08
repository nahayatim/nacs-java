package week2robocode;

import java.util.Scanner;

public class E16W2 {
    public static void main(String[] args) {
        String name = getName();
        Integer number = getOrderNumber();
        sayPrice(name, number);


    }

    private static void sayPrice(String name, Integer number) {
        Integer result = number % 3;
        Integer price = result * 4;
        System.out.println(" Here you are, "+ name + " it's " + price + " Euro. " );
    }

    private static Integer getOrderNumber() {
        System.out.println("Please, tell me your order number.");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    private static String getName() {
        System.out.println("Hello! What is your name?");

        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
}
