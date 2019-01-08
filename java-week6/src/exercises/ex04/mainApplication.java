package exercises.ex04;

import java.util.List;
import java.util.Scanner;

public class mainApplication {

    public static void main(String[] args) {

        System.out.println("enter money = ");
        Scanner scanner = new Scanner(System.in);
        Integer amount = scanner.nextInt();
        GreedyAlgorithm greedyAlgorithm = new GreedyAlgorithm(amount);
        List<Money> change = greedyAlgorithm.change(amount);

        int sum = 0;
        for (Money money : change) {
            sum = sum + money.getAmount();
        }

        System.out.println("number of coins are = " + sum);
    }
}
