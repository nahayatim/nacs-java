package lecture.optional;

public class Friend {

    private String name;
    private Integer amountOfSushi = 0;

    public Friend(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Integer getAmountOfSushi() {
        return amountOfSushi;
    }

    public void eatOneSushi(){
        amountOfSushi++;
    }
}
