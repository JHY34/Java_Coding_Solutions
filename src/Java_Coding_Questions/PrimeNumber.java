package Java_Coding_Questions;

public class PrimeNumber {

    public static void main(String[] args) {

        // What is a prime number?
        // a number that is only divisible by itself and 1

        // Let's test the solution
        System.out.println(isPrimeNumber(10));  // prints: false
        System.out.println(isPrimeNumber(13));  // prints: true
        System.out.println(isPrimeNumber(37));  // prints: true
        System.out.println(isPrimeNumber(50));  // prints: false

        printPrimeNumbers(25);


    }

        public static boolean isPrimeNumber (int number) {

            for (int i=2; i<=number/2; i++) {
                if (number % i == 0) {
                    return false;
                }
            }

            return true;   // by default

        }



        // print prime numbers up to a number
        public static void printPrimeNumbers (int num) {
            for (int i = 2; i < num; i++) {
                if ( isPrimeNumber(i)) {
                    System.out.print(i + " ");
                }

            }
        }








}
