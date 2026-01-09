package com.qa.exercise6;

public class Solution6 {

    public static void main(String[] args) {
        new Counter();
        new Counter();
        System.out.println("Objects created: " + Counter.getCount());
    }
}
