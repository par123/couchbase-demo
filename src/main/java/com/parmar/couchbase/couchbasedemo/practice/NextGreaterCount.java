package com.parmar.couchbase.couchbasedemo.practice;

import java.util.Arrays;
import java.util.Stack;

public class NextGreaterCount {
    public static void main(String[] args) {
        int[] array = {4, 2, 8, 6, 0, 1};
        int[] result = countNextGreater(array);

        System.out.println("Number of elements greater than the next element:");
        System.out.println(Arrays.toString(result));
    }

    public static int[] countNextGreater(int[] array) {
        int n = array.length;
        int[] result = new int[n];
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < n; i++) {
            // Process elements in the stack while the current element is greater
            while (!stack.isEmpty() && array[i] > array[stack.peek()]) {
                int previousIndex = stack.pop();
                result[previousIndex] = i - previousIndex; // Count of elements greater than the next element
            }

            // Push the current index onto the stack
            stack.push(i);
        }
        return result;
    }
}
