package ex03.bootshop;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

//has a getHikingBootRecommendations method that returns a list of
// three different hiking boots with sizes 40, 41 and 42 in random order.


public class BootShopAssistant {

    public List<HikingBoot> getHikingBootRecommendation(){
        List<HikingBoot>boots = new ArrayList<>();
        boots.add(new HikingBoot(40));
        boots.add(new HikingBoot(41));
        boots.add(new HikingBoot(42));
        Collections.shuffle(boots);
        return boots;
    }
}
