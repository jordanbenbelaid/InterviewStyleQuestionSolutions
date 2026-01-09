package com.qa.exercise2;

import java.util.HashMap;
import java.util.Map;

public class Solution2 {
    public static void main(String[] args) {
        countChars("Hello World");
    }

    public static Map<Character, Integer> countChars(String input) {
        Map<Character, Integer> map = new HashMap<>();

        if (input == null) {
            return map;
        }

        for (char c : input.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        return map;
    }
}
