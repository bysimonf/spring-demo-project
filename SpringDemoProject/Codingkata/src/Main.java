public class Main {

    // Option 1 (hard):

    /*static void numAdd(int number) {

        int sum = 0;

        for(sum = 0; number != 0; number = number/10) {
            sum = sum + number % 10;
       }

        System.out.println(sum);
    }*/

    // Option 2 (easy):

    static void sumDigits(int number) {

        String firstCheck = "" + number;

        int sumFirstCheck = 0;

        for (int i = 0; i < firstCheck.length(); i++) {
            sumFirstCheck = sumFirstCheck + Character.getNumericValue(firstCheck.charAt(i));
        }

        if (sumFirstCheck > 9) {

            String secondCheck = "" + sumFirstCheck;

            int sumSecondCheck = 0;

            for (int i = 0; i < secondCheck.length(); i++) {
                sumSecondCheck = sumSecondCheck + Character.getNumericValue(secondCheck.charAt(i));
            }

            System.out.println(sumSecondCheck);

        }

        else {
            System.out.println(sumFirstCheck);
        }
    }


    public static void main(String[] args) {

        sumDigits(146666);

    }
}
