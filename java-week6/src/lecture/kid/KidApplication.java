package lecture.kid;

import java.util.Arrays;
import java.util.List;

public class KidApplication {

    public static void main(String[] args) {

        Kid timmy = new Timmy("ice-cream");
        Kid lisa = new Lisa("pizza");

        List<Kid> kids = Arrays.asList(timmy , lisa);
        for (Kid kid : kids) {
            kid.annoy();
        }
    }
}
