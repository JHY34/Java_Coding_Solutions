package Java_Coding_Questions;

public class PalindromeNumber {

    public static void main(String[] args) {

        // palindrome -> 1234321
        // Dont use String

        System.out.println(isNumberPalindrome(123));    // false
        System.out.println(isNumberPalindrome(12321));  // true
    }


    public static boolean isNumberPalindrome (long number) {
        long reverse = 0;
        long temp = number;

        // using % 10 we can read the last digit

        while (temp != 0) {
            reverse = reverse * 10 + (temp % 10);  // 0 + 1 = 1
                                                     // 10 + 2 = 12
            temp /= 10 ;   // temp = temp / 10
        }


        return reverse == number;
    }

}
