package lecture.validator;

public class LengthRule implements Rule {

    private Integer length = 10;

    @Override
    public boolean isOk(String text) {
        return text.length()<= length;
    }
}
