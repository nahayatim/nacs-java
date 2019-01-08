package exercises.ex06;

//has a list of all the Steps it has to follow to build a wardrobe. It has
//the build method. It creates an empty Wardrobe and applies all the steps
//one by one to it until it’s finished and then it returns it. A Wardrobe
//needs the following to be completed: one bottom, two sides, one back, one
//top, eight shelves and two doors.


import java.util.Arrays;
import java.util.List;

public class WardrobeBuilder {

    private List<Step> steps = getSteps();

    public Wardrobe build(){
        Wardrobe wardrobe = new Wardrobe();
        for (Step step : steps) {
            step.perform(wardrobe);
        }
        return wardrobe;
    }

    private List<Step> getSteps() {
        return Arrays.asList(new AddBottom(),new AddSide(),new AddSide(),new AddBack(),
                new AddTop(), new AddShelf(),new AddShelf(),new AddShelf(),new AddShelf(),
                new AddShelf(), new AddShelf(),new AddShelf(),new AddShelf(),
                new AddDoor(),new AddDoor());
    }
//another way for getSteps()
   // private List<Step> getSteps() {
       // AddBottom bottom = new AddBottom();
        //AddSide side = new AddSide();
       // AddBack back = new AddBack();
       // AddTop top = new AddTop();
       // AddShelf shelf = new AddShelf();
       // AddDoor door = new AddDoor();
       // return Arrays.asList(
               // bottom, side, side, back, top,
                //shelf, shelf, shelf, shelf,
               // shelf, shelf, shelf, shelf,
                //door, door
       // );
    }




