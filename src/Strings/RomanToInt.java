package Strings;

import java.util.HashMap;
import java.util.Map;

public class RomanToInt {

    Map<Character, Integer> map = getRoman();

    public int romanToInt(String s) {
        int sum = 0;
        if (s.length()==0) return 0;
        int last = map.get(s.charAt(0));
        for (char ch : s.toCharArray()) {
            sum += map.get(ch);
            if (map.get(ch) > last) {
                sum -= 2 * last;
            }
            last = map.get(ch);

        }
        return sum;
    }

    public Map<Character, Integer> getRoman() {
        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        return map;
    }
}
