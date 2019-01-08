package week2.libraryaplication;

public class Person {

    private String name;

    private Integer age;

    public Person(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public void think_(){
        System.out.println("I think, therefor i exist");
    }

    public void introduce(){
        System.out.println("I am "+ name);
        System.out.println("I am "+ age+ "years old.");
    }
}
