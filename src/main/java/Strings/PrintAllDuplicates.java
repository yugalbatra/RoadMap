package Strings;

import java.util.HashMap;
import java.util.Map;

public class PrintAllDuplicates {

    public static void main(String[] args) {
        printAllDuplicates("geeksforgeeks");
        printAllDuplicates("yugalbatra");
    }

    public static void printAllDuplicates(String str) {
        Map<Character, Integer> map = new HashMap<>();
        for (char ch : str.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        for (char ch : str.toCharArray()) {
            if (map.get(ch) > 1)  {
                System.out.println("Character " + ch + " appeared " + map.get(ch) + " times.");
                map.put(ch,0);
            }
        }
    }
}
