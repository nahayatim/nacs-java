package ex12;

//has a String name, a String bookOfDeath and a String gender.


public class Character {

    private String name;
    private String bookOfDeath;
    private String gender;

    public Character(String name, String bookOfDeath, String gender) {
        this.name = name;
        this.bookOfDeath = bookOfDeath;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public String getBookOfDeath() {
        return bookOfDeath;
    }

    public String getGender() {
        return gender;
    }

    @Override
    public String toString() {
        return
                "name: " + name  +
                "| book Of Death: " + bookOfDeath +
                "| gender: " + gender + '\'' +
                '}';
    }
}
