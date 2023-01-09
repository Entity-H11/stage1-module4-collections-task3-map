package com.epam.mjc.collections.map;

import java.util.HashMap;
import java.util.Map;

public class KeyValueSwapper {
    public Map<String, Integer> swap(Map<Integer, String> sourceMap) {
        Map<String, Integer> map = new HashMap<>();
        sourceMap.forEach((key, val) -> {
            if (!map.containsKey(val) || (map.containsKey(val) && map.get(val).compareTo(key) > 0)) {
                map.put(val, key);
            }
        });
        return map;
    }
}
