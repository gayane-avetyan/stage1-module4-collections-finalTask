package com.epam.mjc.collections.combined;

import java.util.*;

public class DeveloperProjectFinder {
    public List<String> findDeveloperProject(Map<String, Set<String>> projects, String developer) {

        List<String> devProjects = new ArrayList<>();

        for (Map.Entry<String, Set<String>> el : projects.entrySet()) {
            if (el.getValue().contains(developer))
                devProjects.add(el.getKey());
        }

        return devProjects;
    }
}
