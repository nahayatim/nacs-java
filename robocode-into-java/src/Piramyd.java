

import java.util.Scanner;

public class Piramyd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer height;

        do {
            System.out.println("How big should the half-pyramid be? ");
            height = scanner.nextInt();
        }

        while (height < 0 || height > 23);

        for (Integer line = 0; line < height; line++)

        {
            for (Integer spaces = height - line; spaces > 1; spaces--)
            {

                System.out.printf(" ");
            }

            for (Integer hashTag = 0; hashTag < line + 2; hashTag++)
            {

                System.out.printf("#");
            }

            System.out.printf("\n");


        }

    }
}

