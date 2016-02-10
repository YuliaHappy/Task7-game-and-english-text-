package com.epam.javauniversity.utils.reporter;

import java.util.Map;

public final class Reporter {
    public static String createMap(Map<String, Integer> map) {
        StringBuilder reporter = new StringBuilder();
        map.forEach((k, v)-> reporter.append(k).append(" (").append(v).append(")").append("\n"));
        return reporter.toString();
    }
}
