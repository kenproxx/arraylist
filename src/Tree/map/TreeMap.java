package Tree.map;

import java.util.HashMap;
import java.util.Map;

public class TreeMap {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("kien",14);
        map.put("tin",15);
        map.put("tue",16);
        map.put("huy",17);
        map.put("hung",84);
        for (Map.Entry<String, Integer> item : map.entrySet()) {
            if (item.getValue() == 14) {
                System.out.println(item.getKey());
            }
        }
    }
}


