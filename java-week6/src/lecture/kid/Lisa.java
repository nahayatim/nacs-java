package lecture.kid;

public class Lisa extends Kid {


    public Lisa(String favouriteFood) {
        super(favouriteFood);
    }

    @Override
    protected String getSentence() {
        return "It's not fair!";
    }
}
