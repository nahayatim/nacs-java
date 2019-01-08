package reflection5;

import exercises.ex06.AddShelf;
import exercises.ex06.AddTop;
import exercises.ex06.Step;

import java.util.Arrays;
import java.util.List;

public class TvTableBuilder {

    private List<Step> steps = getSteps();


    public  TvTable build(){
        TvTable tvTable = new TvTable();
        for (Step step : steps) {
            step.perform(tvTable);
        }
        return tvTable;
    }

    public List<Step> getSteps() {
        AddLeg leg = new AddLeg();
        AddShelf shelf = new AddShelf();
        AddTop top = new AddTop();
        List<Step>steps = Arrays.asList(leg,leg,leg,leg,shelf,top);
        return steps;
    }
}
