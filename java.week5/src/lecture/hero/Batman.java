package lecture.hero;

public class Batman implements Hero {
    @Override
    public String getName() {
        return "Batman";
    }

    @Override
    public void saveTheCity() {
        System.out.println("Using his brain and fancy technology");

    }

    public void driveTheBatmobile(){
        System.out.println("uses the batmobile");
    }
}
