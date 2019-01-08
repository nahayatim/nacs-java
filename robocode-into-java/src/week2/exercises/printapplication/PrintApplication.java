package week2.exercises.printapplication;

public class PrintApplication {

    public static void main(String[] args) {
        Article article = new Article("Programing", "I am learnig java.");

        Printer printer = new Printer();
        printer.print(article);

    }
}
