package week2.exercises.magazineapplication;

import week2.exercises.printapplication.Printer;

public class MagazineApplication {

    public static void main(String[] args) {

        Editor editor = new Editor();
        Magazine magazine = editor.writeMagazine();
        Printer printer = new Printer();
        printer.printMagazine(magazine);


    }

}
