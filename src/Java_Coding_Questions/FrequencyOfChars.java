package Java_Coding_Questions;

public class FrequencyOfChars {

    public static void main (String[] args) {

        System.out.println(frequencyOfChars("AAABBCCCCCCD"));
        
        int i = 5/2;
        System.out.println("i = " + i);


    }

    public static String frequencyOfChars (String str) {
        String result = "";
        int numOfChars = str.length();

        for (int i=0; i<=numOfChars-1; i++) {
            int count = 0;
            if (!result.contains("" + str.charAt(i))) {
                result += str.charAt(i);
                count++;
            }
            else if (result.contains("" + str.charAt(i))) {
                count++;
            }

            result += count;
        }




        return result;
    }

}
