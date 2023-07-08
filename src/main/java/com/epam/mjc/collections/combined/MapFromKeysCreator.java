package com.epam.mjc.collections.combined;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MapFromKeysCreator {
    public Map<Integer, Set<String>> createMap(Map<String, Integer> sourceMap) {

        Map<Integer, Set<String>> map = new HashMap<>();

        for (Map.Entry<String, Integer> el : sourceMap.entrySet()) {

            int key = el.getKey().length(); //

            if (map.containsKey(key))
                map.get(key).add(el.getKey());
            else {
                Set<String> value = new HashSet<>();
                value.add(el.getKey());
                map.put(key, value);
            }
        }

        return map;
    }
}
