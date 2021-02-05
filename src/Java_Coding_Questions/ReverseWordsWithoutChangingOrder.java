package Java_Coding_Questions;

public class ReverseWordsWithoutChangingOrder {
    public static void main(String[] args) {

        String abc = "I love javaaaalllll";

        System.out.println(reverseString(abc));

    }
    // str == I love java --> I evol avaj
    public static String reverseString (String str) {
        String[] arr = str.split(" ");
        String result = "";


        for (int i=0; i<arr.length; i++) {

            String word = arr[i];
            for (int j = word.length()-1; j>=0; j--) {

                result += word.charAt(j);

            }

            result += " ";

        }

        return result;
    }

}
