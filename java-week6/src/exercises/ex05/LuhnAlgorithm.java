package exercises.ex05;

public class LuhnAlgorithm {
    public Boolean validate(String cardNumber){
        String[] split = cardNumber.split("");
        Integer lastPosition = split.length - 1;
        Integer sum = 0;
        boolean flag = false;
        Integer currentInteger = 0;

        for (int position = lastPosition; position>=0 ; position--) {
            String currentChar = split[position];
            currentInteger = Integer.valueOf(currentChar);
            System.out.println("currentChar = "+currentChar);
            if (flag){
                currentInteger = currentInteger * 2;
                if(currentInteger>9){
                    currentInteger = sumOfDigits(currentInteger);
                }
            }
            sum = sum + currentInteger;
            System.out.println(sum+ "-"+currentInteger);
            flag = !flag;

        }
        return sum%10 == 0;
    }

    private Integer sumOfDigits(Integer number) {
        int remain = number % 10;
        int div = number / 10;
        return remain + div;
    }
}
