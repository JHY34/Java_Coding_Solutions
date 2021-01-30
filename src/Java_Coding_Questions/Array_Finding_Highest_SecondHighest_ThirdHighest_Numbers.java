package Java_Coding_Questions;

public class Array_Finding_Highest_SecondHighest_ThirdHighest_Numbers {

    public static void main(String[] args) {

        int[] arr1 = {3,5,10,2,56,-21};

        System.out.println(highestNumber(arr1));

    }

    public static int highestNumber (int[] arr) {
        int highestNumber = Integer.MIN_VALUE;

        for (int i=0; i<arr.length; i++) {

            if (arr[i]> highestNumber) {
                highestNumber = arr[i];
            }
        }

        return highestNumber;

    }

}


