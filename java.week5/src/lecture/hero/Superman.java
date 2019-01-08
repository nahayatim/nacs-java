package lecture.hero;

public class Superman implements Hero{


    @Override
    public String getName() {
        return "superman";
    }

    @Override
    public void saveTheCity() {

        System.out.println("Using his superpowers");

    }
}
