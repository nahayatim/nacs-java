package ex02;

import java.util.Scanner;

public class NicknameApplication {
    public static void main(String[] args) {

        NicknameCreator nicknameCreator = new NicknameCreator();
        System.out.println("Write a word: ");
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        String nickname = nicknameCreator.createNickname(word);
        System.out.println(nickname);


    }
}
