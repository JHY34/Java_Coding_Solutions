package Java_Coding_Questions;

public class PrimeNumber {

    // What is a prime number?
    // a number that is only divisible by itself and 1

    public static boolean isPrimeNumber (int number) {

        for (int i=2; i<=number; i++) {
            if (number % i == 0) {
                return false;
            }
        }



        return true;   // by default

    }




}
