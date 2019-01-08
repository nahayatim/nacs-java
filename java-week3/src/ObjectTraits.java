public class ObjectTraits {
    public static void main(String[] args) {

        Integer number1 = 5;
        Integer number2 = 2;

        int comparison = number1.compareTo(number2);
        System.out.println(comparison);
        if (comparison == -1){
            System.out.println(number1 + " is smaller than "+ number2);
        }

        if (comparison ==0){
            System.out.println(number1 + " is equal to "+ number2);
        }
        if (comparison == 1){
            System.out.println(number1 +"is bigger than "+ number2);
        }

        String number1AsString = number1.toString();
        System.out.println(number1AsString);

        Hummus hummus = new Hummus();
        String hummusAsString = hummus.toString();
        System.out.println(hummusAsString);

        if (!number1.equals(number2)){
            System.out.println(number1 + " does not equal "+number2);
        }


    }
}
