package org.example;

import java.util.Arrays;

public class Task5 {
    public static void main(String[] args) {
        final int[] arr = {2, 5, 3, 2, 1, 3, 6, 5, 3};
        Arrays.stream(arr).distinct().mapToObj(i -> i + " ").forEach(System.out::print);
    }
}