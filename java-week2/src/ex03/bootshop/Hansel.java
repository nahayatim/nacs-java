package ex03.bootshop;

 //has a footSize attribute with the value 41.
//an isRightSize method that receives a HikingBoot and compares its size with
//his footSize and returns if they are the same.
//This method has private visibility so that only the Hansel class can use it.


import java.util.List;

public class Hansel {

    private Integer footSize = 41;

    private Boolean isRightSize(HikingBoot boot){
        return footSize.equals(boot.getSize());
    }

    // tryHikingBoots method that receives a list of HikingBoot and
    //tries them one by one. If the HikingBoot doesn’t have the right size,
    //he will say “This one does not fit, sorry.” and continue with the next.
    //If it is 41 he will say “I’m buying this one, thanks!”
    //and stop trying more boots.

    public void tryHikingBoot(List<HikingBoot> boots){
        for (HikingBoot boot : boots) {
            if(isRightSize(boot)){
                System.out.println("I'm buying this one, thanks!");
                return;
            }
            System.out.println("This one does not fit, sorry.");
        }
    }

}
