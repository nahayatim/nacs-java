package lecture.optional;

import java.util.Optional;

public class Printer {

    private Integer numberOfPages;

    public Printer(Integer numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public void addPages(Integer pages){
        System.out.println("Adding "+ pages+" pages");
        numberOfPages += pages;
    }

    public Optional<String> print(String text){
        String upperCase = text.toUpperCase();
        System.out.println("Number of pages left: "+numberOfPages);
        if (numberOfPages == 0){
            return Optional.empty();
        }
        numberOfPages--;
        return Optional.of(upperCase);
    }

    public String specialPrint(String text){
        return text.toUpperCase();
    }
}
