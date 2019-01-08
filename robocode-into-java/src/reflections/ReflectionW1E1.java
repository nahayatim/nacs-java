package reflections;

import java.util.Scanner;

public class ReflectionW1E1 {
    public static void main(String[] args) {

        Integer DerekMoney = getInteger();

        Integer FreindsNumber = getFiendNumber();
        Integer totalMoney = getTotalMoney(FreindsNumber);

        inviteFriend(DerekMoney, totalMoney);


    }

    private static Integer payForDerek() {
        System.out.println("How much money i have to pay?");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    private static Integer getInteger() {
        System.out.println("How much money Derek has?");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    private static Integer getFiendNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many freinds having dinner with Derek?");
        return scanner.nextInt();
    }

    private static Integer getTotalMoney(Integer freindsNumber) {
        Integer totalMoney=0 ;
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i< freindsNumber; i++ ){


            System.out.println("How much money do you have to pay? ");
            Integer money = scanner.nextInt();
            totalMoney = totalMoney + money; }
        return totalMoney;
    }


    private static void inviteFriend(Integer derekMoney, Integer totalMoney) {
        if (derekMoney <totalMoney){
            System.out.println("Derek has not enough money.");
            return;
        }
        System.out.println("I will invite you all.");
        totalMoney+=payForDerek();
        if (derekMoney<totalMoney){
                    System.out.println("Sorry!i made a mistake calculating and i can't invite you today.");
        }
    }
}


//Mahtab