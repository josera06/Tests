package com.jrce.javatest;

import java.util.HashMap;
import java.util.Map;

public class Ch02TwoSum {

    public static void main(String[] args) {
        int[] numbers = new int[]{2, 3, 7, 4, 8};
        int target = 7;
        int[] result = getTwoSum(numbers, target);
        System.out.println(result[0] + " " + result[1]);
    }

    public static int[] getTwoSum(int[] numbers, int target) {
        Map<Integer, Integer> visitedNumbers = new HashMap<Integer, Integer>();

        for (int i = 0; i < numbers.length; i++) {
            int delta = target - numbers[i];
            System.out.println("delta = " + delta);
            if (visitedNumbers.containsKey(delta)) {
                return new int[]{i, visitedNumbers.get(delta)};
            }
            visitedNumbers.put(numbers[i], i);
            System.out.println("Map: " + visitedNumbers);
        }
        return new int[]{-1, -1};

    }

}
