package lecture.developer;

public class DeveloperApplication {
    public static void main(String[] args) {

        Problem problem = new Problem();

        FrontEndSkills feSkills = new FrontEndSkills();
        BackEndSkills beSkills = new BackEndSkills();
        FullStackSkills fsSkills = new FullStackSkills();

        Developer feDeveloper = new Developer(feSkills);
        feDeveloper.solve(problem);

        Developer beDeveloper = new Developer(beSkills);
        beDeveloper.solve(problem);

        Developer fsDeveloper = new Developer(fsSkills);
        fsDeveloper.solve(problem);

        Developer awesomeDeveloper = new Developer();
        awesomeDeveloper.solve(problem, feSkills);
        awesomeDeveloper.solve(problem, beSkills);
        awesomeDeveloper.solve(problem, fsSkills);


    }
}
