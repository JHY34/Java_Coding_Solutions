package Java_Coding_Questions;

import java.util.Arrays;

public class Anagram {

     /*
     lowercase letters index # between 97 - 122
    listen  (+1)
    silent  (-1)
     */

    public static void main(String[] args) {

        System.out.println(isAnagram("lemon", "meloa"));


    }

    public static boolean isAnagram (String one, String two) {

        if (one.length() != two.length()) return false;

        one = one.toLowerCase();
        two = two.toLowerCase();

        int[] counter = new int[26];
        // a:0  b:1  ... z:25
        // abcdaabb -
        // dbcababa
        // [0,0,0,0]


        for (int i = 0; i <= one.length()-1; i++) {

            char oneLetter = one.charAt(i);
            char twoLetter = two.charAt(i);


        counter[oneLetter - 97] = counter[oneLetter - 97] + 1;
        counter[twoLetter - 97] = counter[twoLetter - 97] - 1;

    }

        return Arrays.equals(counter, new int[26]);

    }








}
