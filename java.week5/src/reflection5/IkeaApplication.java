package reflection5;

public class IkeaApplication {

    public static void main(String[] args) {

        TvTableBuilder tvTableBuilder = new TvTableBuilder();
        TvTable build1 = tvTableBuilder.build();
        System.out.println(build1);


    }
}
