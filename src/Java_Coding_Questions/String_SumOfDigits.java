package Java_Coding_Questions;

public class String_SumOfDigits {
    public static void main(String[] args) {

        String str = "abbbcc12345";

        System.out.println("sumOfDigits(str) = " + sumOfDigits(str));

    }

    public static int sumOfDigits (String str) {

        int sum = 0;

        for (int i=0; i<str.length(); i++) {
            // ascii table 48 = 0 ---> 57 = 9
            if (str.charAt(i) >= 48 && str.charAt(i) <=57 ) {

                sum += str.charAt(i) - 48;

            }
        }

        return sum;

    }
}
