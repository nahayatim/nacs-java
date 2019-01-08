import java.util.Arrays;

public class TraitsForString {
    public static void main(String[] args) {

        String nacs = "New Austrian Coding School";
        if (!nacs.isEmpty()){
            System.out.println("Nacs is not empty");
        }

        String upperCase = nacs.toUpperCase();
        System.out.println(upperCase);

        String toLowerCase = nacs.toLowerCase();
        System.out.println(toLowerCase);

        if (!nacs.equals("new austrian coding school")){
            System.out.println("It is not equal because of uppercase");

        }
        if (nacs.equalsIgnoreCase("new austrian coding school")){
            System.out.println("It is equal");
        }

        String nac = nacs.replaceAll("Coding", " ");
        System.out.println(nac);
        if (nacs.startsWith("New")){
            System.out.println("it start with New");
        }
        if(nacs.contains("Coding")){
            System.out.println("it contains coding");
        }
        if (nacs.endsWith("School")){
            System.out.println("It ends with school");
        }
        int length = nacs.length();
        System.out.println(length);

        String substring = nacs.substring(20, 26);
        System.out.println(substring);

        String[] words = nacs.split(" ");
        System.out.println(Arrays.asList(words));

        //for devided by every letter
        //String[] letters = nacs.split("");



        String withSpacesAround = "  some spaces before and after   ";
        System.out.println(withSpacesAround);
        String withoutSpacesAround = withSpacesAround.trim();
        System.out.println(withoutSpacesAround);

        String substring1 = "quiz time".substring(3, 7);
        System.out.println(substring1);

        String quote = "The lips of wisdom are closed expect to the ears of understand";
        boolean wisdomMatches = quote.matches(".*wisdom.*");
        System.out.println("wisdom is in that sentence.result is: "+ wisdomMatches);


        String a ="a";
        String d = "d";
        boolean amatches = a.matches("[abc]");
        boolean dmatches = d.matches("[abc]");
        System.out.println("Letter a is in [abc], Result is: "+ amatches);
        System.out.println("Letter d is not in [abc]. Result is "+dmatches);


    }
}
