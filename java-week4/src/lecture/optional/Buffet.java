package lecture.optional;

import java.util.*;

public class Buffet {

    private List<Friend> friends;

    public Buffet(List<Friend> friends) {
        this.friends = friends;
    }

    public Optional<Friend> findTheOneWhoAteTheMostSushi(){
        if (friends.isEmpty()){
            return Optional.empty();
        }
        Collections.sort(friends, Comparator.comparing(Friend::getAmountOfSushi));
        int lastOne = friends.size() - 1;
        Friend winner = friends.get(lastOne);
        if (winner.getAmountOfSushi() == 0){
            return Optional.empty();
        }
        return Optional.of(winner);
    }

    public void startEatingLikeCrazy(){
        Random random = new Random();
        for (int times =0; times< 100; times++) {
            int position = random.nextInt(friends.size());
            Friend randomFriend = friends.get(position);
            randomFriend.eatOneSushi();

        }
    }
}
