package week2.exercises.printapplication;

import week2.exercises.magazineapplication.Magazine;

import java.util.List;

public class Printer {


    public void print(Article article){
        System.out.println( "Article title: " + article.getTitle());
        System.out.println( "Article text: "+ article.getText());
    }

    public  void printMagazine(Magazine magazine){
        System.out.println("Magazine title: "+ magazine.getTitle());
        List<Article>articles = magazine.getArticles();
        for (Article article : articles){
            print(article);

        }
    }



}
