package exercises.ex07;

import java.util.List;
import java.util.Random;

public class Computer implements Player {

    private Random random = new Random();

    @Override
    public Move choose() {
        List<Move> moves = Moves.asList();
        int position = random.nextInt(moves.size());
        return moves.get(position);
    }

    @Override
    public boolean wantsToPlayAgain() {
        return true;
    }
}
