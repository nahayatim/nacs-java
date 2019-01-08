package ceasar;

import java.util.Scanner;

public class CaesarApplication {

    public static void main(String[] args) {

        System.out.println("please give the Text");
        Scanner scanner= new Scanner(System.in);
        String plaintext= scanner.nextLine();
        System.out.println("please give the key");
        Integer key=scanner.nextInt();

        Caesar caesar= new Caesar();
        String ciphertext = caesar.encrypt(plaintext, key);
        System.out.println(ciphertext);

    }


}
