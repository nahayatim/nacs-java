package week2.lecture.halloweenapplication;

public class Kid {

    private String name;
    private Integer numberOfCandies;

    public Kid(String name, Integer numberOfCandies){
        this.name = name;
        this.numberOfCandies =numberOfCandies;
    }

    public String getName() {
        return name;
    }

    public Integer getNumberOfCandies(){
        return numberOfCandies;
    }
}
