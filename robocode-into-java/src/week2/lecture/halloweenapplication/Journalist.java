package week2.lecture.halloweenapplication;

import java.util.ArrayList;
import java.util.List;

public class Journalist {

    public List<Kid> getNeighborhoodKids(){
        List<Kid> kids = new ArrayList<>();
        Kid jimmy = new Kid("jimmy",10);
        kids.add(jimmy);
        kids.add(new Kid("Tom",4));
        kids.add(new Kid("sam",11));
        kids.add(new Kid("pamela",16));
        return kids;
    }
}
