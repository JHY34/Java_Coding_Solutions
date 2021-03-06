package Java_Coding_Questions;

public class Array_Finding_Highest_SecondHighest_ThirdHighest_Numbers {

    public static void main(String[] args) {

        int[] arr1 = {10,1,3,5,10,2,56,-21,15,-56};
        // h min 15   15
        // s min min  3
        // t min min  min

        System.out.println("highestNumber(arr1) = " + highestNumber(arr1));
        System.out.println("secondHighestNumber(arr1) = " + secondHighestNumber(arr1));
        System.out.println("thirdHighestNumber(arr1) = " + thirdHighestNumber(arr1));

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

    public static int secondHighestNumber (int[] arr) {
        int highestNumber = Integer.MIN_VALUE;
        int secondHighestNumber = Integer.MIN_VALUE;

        for (int i=0; i<arr.length; i++) {

            if (arr[i]> highestNumber) {
                secondHighestNumber = highestNumber;
                highestNumber = arr[i];
            }
            else if (arr[i]> secondHighestNumber && arr[i] != highestNumber) {
                secondHighestNumber = arr[i];
            }
        }

        return secondHighestNumber;

    }

    public static int thirdHighestNumber (int[] arr) {
        int highestNumber = Integer.MIN_VALUE;
        int secondHighestNumber = Integer.MIN_VALUE;
        int thirdHighestNumber = Integer.MIN_VALUE;

        for (int i=0; i<arr.length; i++) {

            if (arr[i]> highestNumber) {
                thirdHighestNumber = secondHighestNumber;
                secondHighestNumber = highestNumber;
                highestNumber = arr[i];
            }
            else if (arr[i]> secondHighestNumber && arr[i] < highestNumber) {
                thirdHighestNumber = secondHighestNumber;
                secondHighestNumber = arr[i];
            }
            else if (arr[i]> thirdHighestNumber && arr[i] < secondHighestNumber) {
                thirdHighestNumber = arr[i];
            }
        }

        return thirdHighestNumber;

    }

}


