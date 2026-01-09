package com.qa.exercise1;

public class SolutionOne {

    public static void main(String[] args) {
        reverse("Hello world");
    }

    public static String reverse(String input) {
        if (input == null) {
            return null;
        }

        char[] chars = input.toCharArray();
        int left = 0;
        int right = chars.length - 1;

        while (left < right) {
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;
            left++;
            right--;
        }

        return new String(chars);
    }
}
