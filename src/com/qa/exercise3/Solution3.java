package com.qa.exercise3;

import java.util.ArrayList;
import java.util.List;

public class Solution3 {
    public static void main(String[] args) {
        List<Integer> numList = new ArrayList<>();
        numList.add(1);
        numList.add(1);
        numList.add(2);
        numList.add(3);
        numList.add(4);
        numList.add(3);

        removeDuplicates(numList);
    }

    public static List<Integer> removeDuplicates(List<Integer> list) {
        List<Integer> result = new ArrayList<>();

        if (list == null) {
            return result;
        }

        for (Integer value : list) {
            if (!result.contains(value)) {
                result.add(value);
            }
        }

        return result;
    }
}
