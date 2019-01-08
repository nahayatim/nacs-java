package week2.exercises.magazineapplication;

import week2.exercises.printapplication.Article;

public class Editor {

    public Magazine writeMagazine(){
        Magazine magazine = new Magazine("Best magazine ever");
        magazine.add(new Article("Next week weather", "extream cold"));
        magazine.add(new Article("developer program" , "at 9 uhr"));
        magazine.add(new Article("njn ij", "huihni"));
        return magazine;

    }

}
