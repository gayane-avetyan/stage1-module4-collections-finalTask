package com.epam.mjc.collections.combined;

import java.util.*;

public class LessonsGetter {
    public Set<String> getLessons(Map<String, List<String>> timetable) {

        Set<String> allLessons = new HashSet<>();

        for (Map.Entry<String, List<String>> el : timetable.entrySet()) {
            allLessons.addAll(el.getValue());
        }

        return allLessons;
    }
}
