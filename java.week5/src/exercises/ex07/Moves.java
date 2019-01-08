package exercises.ex07;



import java.util.*;

public class Moves {



    private static Set<Move> moves = new HashSet<>(Arrays.asList(
            new Rock(), new Scissors(), new Paper()));

    public static String asString(){
        List<String> names = new ArrayList<>();
        for (Move move: moves) {
            names.add(move.getName());
        }

        return String.join(", ",names);
    }

    public static Optional<Move> get(String moveName) {
        for (Move move : moves) {
            if (move.getName().equalsIgnoreCase(moveName)){
                return Optional.of(move);
            }
        }
        return Optional.empty();
    }

    public static List<Move> asList() {
        return new ArrayList<>(moves);
    }
}
