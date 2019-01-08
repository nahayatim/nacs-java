package week2robocode;

import java.util.Scanner;

public class GoingToCinema {
    public static void main(String[] args) {
        if(!isWearingAHat() && !isBringingAPet()){
            System.out.println("Welcome to our cinema");
        }else{
            System.out.println("I'm sorry,but you are not allowed to enter");
        }
    }

    public static Boolean isWearingAHat(){
        System.out.println("ARE YOU WEARING A HAT?");

        Scanner scanner= new Scanner(System.in);
        String answer= scanner.nextLine();

        return answer.equals("yes");
    }

    public static Boolean isBringingAPet(){
        System.out.println("Are you bringing a pet?");

        Scanner scanner= new Scanner(System.in);
        String answer= scanner.nextLine();

        return answer.equals("yes");
    }
}
