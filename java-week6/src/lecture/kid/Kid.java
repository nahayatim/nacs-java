package lecture.kid;

public abstract class Kid {

    private String favouriteFood;

    public Kid(String favouriteFood) {
        this.favouriteFood = favouriteFood;
    }

    public void annoy(){
        System.out.println(getSentence() + " I want to eat "+ favouriteFood);
    }

    protected abstract String getSentence();


}

