package com.epam.mjc.collections.combined;
import java.util.*;

public class LessonsGetter {
    public Set<String> getLessons(Map<String, List<String>> timetable) {
        Set<String> lessons = new HashSet<>();
        for (List<String> dayLessons : timetable.values()) {
            lessons.addAll(dayLessons);
        }
        return lessons;
    }
}
