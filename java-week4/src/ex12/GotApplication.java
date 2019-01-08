package ex12;

import java.util.*;

public class GotApplication {
    public static void main(String[] args) {

        List<Character> characters = getCharacters();
        List<Character> dead = getDead(characters);

        System.out.println("Number of characters: " + characters.size());
        System.out.println("Number of dead characters: " + dead.size());

        showGenderPercentages(dead);

        Map<Integer, List<Character>> books = groupByBook(dead);
        List<Map.Entry<Integer, Integer>> sortedBookDeadCounts = sortByDeadCount(books);

        for (Map.Entry<Integer, Integer> book : sortedBookDeadCounts) {
            System.out.println("Book: " + book.getKey() + " | Deaths: " + book.getValue());
        }

        Map.Entry<Integer, Integer> book = sortedBookDeadCounts.get(0);

        System.out.println("Book with the most dead counts is book " + book.getKey() + " with " + book.getValue() + " deaths");
        System.out.println("Characters who died in book number " + book.getKey() + ":");
        List<Character> bookDeadlist = books.get(book.getKey());
        for (Character character : bookDeadlist) {
            System.out.println(character);
        }

    }

    private static List<Character> getCharacters() {
        CharacterReader characterReader = new CharacterReader();
        return characterReader.asList("ex12/got-characters.csv");
    }

    private static List<Character> getDead(List<Character> characters) {
        List<Character> deads = new ArrayList<>();
        for (Character character : characters) {
            if (!character.getBookOfDeath().isEmpty()) {
                deads.add(character);
            }
        }
        return deads;
    }

    private static void showGenderPercentages(List<Character> dead) {
        Map<String, Integer> ratio = new HashMap<>();
        for (Character character : dead) {
            String gender = character.getGender();
            if (!ratio.containsKey(gender)) {
                ratio.put(gender, 0);
            }
            Integer amount = ratio.get(gender);
            ratio.put(gender, amount + 1);
        }

        Integer deadMen = ratio.get("man");
        Integer deadWomen = ratio.get("woman");
        System.out.println("Dead men: " + deadMen + " | Dead women: " + deadWomen);

        int deadPeople = dead.size();
        int menPercentage = (deadMen * 100) / deadPeople;
        int womenPercentage = (deadWomen * 100) / deadPeople;
        System.out.println("Dead men: " + menPercentage + "% | Dead women: " + womenPercentage + "%");
    }

    private static Map<Integer, List<Character>> groupByBook(List<Character> deads) {
        Map<Integer, List<Character>> books = new HashMap<>();
        for (Character character : deads) {
            String bookOfDeath = character.getBookOfDeath();
            Integer book = Integer.valueOf(bookOfDeath);
            if (!books.containsKey(book)) {
                books.put(book, new ArrayList<>());
            }
            List<Character> characters = books.get(book);
            characters.add(character);
        }
        return books;
    }

    private static List<Map.Entry<Integer, Integer>> sortByDeadCount(Map<Integer, List<Character>> books) {
        Map<Integer, Integer> bookDeadCounts = getBookDeadCounts(books);
        Set<Map.Entry<Integer, Integer>> set = bookDeadCounts.entrySet();
        List<Map.Entry<Integer, Integer>> list = new ArrayList<>(set);
        list.sort(Comparator.comparing(Map.Entry::getValue));
        Collections.reverse(list);
        return list;
    }

    private static Map<Integer, Integer> getBookDeadCounts(Map<Integer, List<Character>> books) {
        Map<Integer, Integer> count = new HashMap<>();
        for (Map.Entry<Integer, List<Character>> entry : books.entrySet()) {
            Integer book = entry.getKey();
            int amount = entry.getValue().size();
            count.put(book, amount);
        }
        return count;
    }


}

//Create the GotApplication class that has a main method that uses
//the CharacterReader to read the got-characters.csv and performs the
//code that answers the previously given questions.
//Number of characters: 917
//Number of dead characters: 307
//Dead men: 271 | Dead women: 36
//Dead men: 88% | Dead women: 11%
//Book: 3 | Deaths: 97
//Book: 2 | Deaths: 73
// Book: 5 | Deaths: 61
//Book: 1 | Deaths: 49
// Book: 4 | Deaths: 27
// Book with the most dead counts is book 3 with 97 deaths
// Characters who died in book number 3:
// {name : Aegon Frey (Jinglebell) | book of death : 3 | gender : man}
// {name : Alyn | book of death : 3 | gender : man}
//{name : Anvil Ryn | book of death : 3 | gender : man}
// {name : Bannen | book of death : 3 | gender : man}
//{name : Becca the Baker | book of death : 3 | gender : woman}

