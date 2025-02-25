package com.epam.mjc.collections.combined;

import java.util.*;

public class DeveloperProjectFinder {
    public List<String> findDeveloperProject(Map<String, Set<String>> projects, String developer) {

        List<String> devProjects = new ArrayList<>();

        for (Map.Entry<String, Set<String>> el : projects.entrySet()) {
            if (el.getValue().contains(developer))
                devProjects.add(el.getKey());
        }

        devProjects.sort((o1, o2) -> {

            if(o1.length() > o2.length())
                return -1;
            else if(o1.length() < o2.length())
                return 1;
            else
                return o2.compareTo(o1);
        });

        return devProjects;
    }
}
