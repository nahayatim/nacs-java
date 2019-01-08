package lecture;

import java.util.*;

public class HandsOnExample {
    public static void main(String[] args) {
        listExample();
        setExample();
        mapExample();
        optionalExample();

    }


    public static void listExample(){

        System.out.println("LIST EXAMPLE -------------");

        List<String> playlist = new ArrayList<>();

        playlist.add("paradaise");
        playlist.add("yellow");
        playlist.add("chop suey");
        playlist.add("chop suey");
        playlist.add("chop suey");
        playlist.add("ode joy");
        playlist.add("imagine");

        String firstString = playlist.get(0);

        System.out.println("first song: "+firstString);

        for (String song : playlist) {
            System.out.println(song);
        }
    }

    private static void setExample(){
        Set<String> playlist = new HashSet<>();

        System.out.println("SET EXAMPLE ------------");

        playlist.add("paradaise");
        playlist.add("yellow");
        playlist.add("chop suey");
        playlist.add("chop suey");
        playlist.add("chop suey");
        playlist.add("ode joy");
        playlist.add("imagine");

        boolean containsChopSuey = playlist.contains("chop suey");
        System.out.println("Is chop suey there: "+containsChopSuey);

        for (String song : playlist) {
            System.out.println(song);
        }
    }
    private static void mapExample(){
        Map<String, String> dictionary = new HashMap<>();

        System.out.println("MAP EXAMPLE ----------");

        dictionary.put("tomato","Tomato");
        dictionary.put("Car","Auto");
        dictionary.put("potato","Kartofel");

        String germanCar = dictionary.get("car");
        System.out.println("German for car: "+ germanCar);

        Collection<String> englishWords = dictionary.keySet();

        System.out.println(englishWords);

        Collection<String> germanWords = dictionary.values();
        System.out.println(germanWords);

        boolean isRoomThere = dictionary.containsKey("room");
        System.out.println("Is room there : "+ isRoomThere);

        Set<Map.Entry<String,String>> translations = dictionary.entrySet();

        System.out.println("All translation: ");

        for (Map.Entry<String, String> translation : translations) {
            String englishWord = translation.getKey();
            String germanWord = translation.getValue();

            System.out.println(englishWord+ " means: "+germanWord);
        }
    }

    private static void optionalExample(){
        Optional<String> myPackage = getPackage();
        if (myPackage.isPresent()){
            System.out.println("Yeah I got: "+ myPackage.get());
        }else {
            System.out.println("Oh no, where is my package?");
        }

    }

    private static Optional<String> getPackage(){
        if (isPackageThere()){
            return Optional.of("christmas present");
        }else {
            return Optional.empty();
        }

    }

    private static boolean isPackageThere(){
        Random random = new Random();
        return random.nextBoolean();

    }
}
