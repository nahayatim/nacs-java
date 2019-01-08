package exercises.ex06;

//Create a WardrobeBuilder and build one Wardrobe.
//Display the wardrobe. It should have all the right parts.


public class IkeaApplication {
    public static void main(String[] args) {

        WardrobeBuilder builder= new WardrobeBuilder();
        Wardrobe wardrobe = builder.build();
        System.out.println(wardrobe);

    }
}
