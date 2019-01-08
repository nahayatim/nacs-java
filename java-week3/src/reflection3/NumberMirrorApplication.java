package reflection3;

//In the NumberMirrorApplication class main method, ask the user for a number,
//create a NumberMirror, use it to find its mirror number and display both.
//In the NumberMirrorApplication class main method, apply the special mirror
//to the same number it was previously requested and display it as well.



import java.util.Scanner;

public class NumberMirrorApplication {
    public static void main(String[] args) {

        System.out.println("Write a Number: ");
        Scanner scanner = new Scanner(System.in);
        Integer number = scanner.nextInt();
        NumberMirror numberMirror = new NumberMirror();
        System.out.println(numberMirror.mirror(number));
        System.out.println(numberMirror.specialMirror(number));

    }
}
