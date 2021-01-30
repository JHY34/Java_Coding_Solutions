package Java_Coding_Questions;

public class Array_Finding_Highest_SecondHighest_ThirdHighest_Numbers {

    public static void main(String[] args) {

        int[] arr1 = {3,5,10,2,56,-21,15};

        System.out.println(secondHighestNumber(arr1));

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
            else if (arr[i]> secondHighestNumber) {
                secondHighestNumber = arr[i];
            }
        }

        return secondHighestNumber;

    }

}


