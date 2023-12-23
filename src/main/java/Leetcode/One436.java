package Leetcode;

import java.util.*;

public class One436 {
    public String destCity(List<List<String>> paths) {
        Map<String, String> map = new HashMap<>();
        for (List<String> strings: paths) {
            map.put(strings.get(0), strings.get(1));
        }

        String desination = paths.get(0).get(1);
        while (map.get(desination) != null) {
            desination = map.get(desination);
        }

        return desination;
    }

    public String destCityUsingHashSet(List<List<String>> paths) {
        Set<String> cities = new HashSet<>();
        for (List<String> path : paths) {
            cities.add(path.get(0));
        }

        for (List<String> path : paths) {
            String dest = path.get(1);
            if (!cities.contains(dest)) {
                return dest;
            }
        }

        return "";
    }
}
