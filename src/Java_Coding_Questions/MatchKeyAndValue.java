package Java_Coding_Questions;

// There are two lists.
// One list has items : cakes, cookies, popcorn and candies.
// Other list has prices : 100, 30, 50, 40.
// Match the items with their prices using Maps.
// items are keys. prices are values

import java.util.*;

public class MatchKeyAndValue {
    public static void main(String[] args) {

        List <String> items = new ArrayList<>(Arrays.asList("cakes", "cookies", "popcorn" , "candies"));

        List <Integer> prices = new ArrayList<>(Arrays.asList(100, 30, 50, 40));

        Map<String, Integer> items_prices = new LinkedHashMap<>();

        for (int i = 0; i<items.size(); i++) {
            items_prices.put(items.get(i) , prices.get(i));
        }

        System.out.println(items_prices);


    }
}
