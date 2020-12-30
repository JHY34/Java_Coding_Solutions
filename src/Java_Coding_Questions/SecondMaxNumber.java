package Java_Coding_Questions;

public class SecondMaxNumber {

    /*
    [3,5,1,4,12,4,1,8,12] --> Max: 12 --> SecondMax: 8

    max: 3 - 5
    second: - 3
     */

    // NOT COMPLETED TEST WORK ON IT
    public static int secondMaxNumber (int[] arr) {
        int max = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

     for (int eachNum: arr) {
         if (eachNum > max) {
             second = max;
             max = eachNum;
         }
         if (eachNum > second && eachNum < max) {
           //  second =

         }
     }

        return second;
    }


}
