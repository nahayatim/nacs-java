package lecture.developer;

import lecture.developer.Problem;
import lecture.developer.Skills;

public class Developer {

    private Skills skills;

    public Developer(){

    }

    public Developer(Skills skills) {
        this.skills = skills;
    }

    public void solve(Problem problem) {
        String solution = skills.solve(problem);
        System.out.println(solution);
    }

    public void solve(Problem problem, Skills skills){
        String solution = skills.solve(problem);
        System.out.println(solution);
    }
}
