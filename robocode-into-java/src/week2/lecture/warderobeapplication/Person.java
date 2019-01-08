package week2.lecture.warderobeapplication;

import week2.lecture.warderobeapplication.Cloth;

public class Person {

    private String name;
    private Cloth cloth;


    public Person(String name) {
        this.name = name;
    }

    public void wear(Cloth cloth){
        this.cloth= cloth;
    }

    public void sayWhatIWear(){
        if (cloth== null){
            System.out.println(name + " is naked.");
            return;
        }
        System.out.println(name+ " is wearing "+ cloth.getName());

    }



}
