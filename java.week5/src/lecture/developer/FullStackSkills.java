package lecture.developer;

public class FullStackSkills implements Skills {

    private FrontEndSkills feSkills = new FrontEndSkills();
    private BackEndSkills beSkills = new BackEndSkills();

    @Override
    public String solve(Problem problem) {

        String solution1 = feSkills.solve(problem);
        String solution2 = beSkills.solve(problem);
        String finalSolution = combine(solution1,solution2);
        return finalSolution;
    }

    private String combine(String solution1, String solution2) {
        return solution1+ " "+ solution2;
    }
}
