package org.example;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            Map<String, Integer> hashMap = new HashMap<>();
            for (int i = 0; i < 4; i++) {
                String key;
                if (i == 0) {
                    key = "a";
                } else if (i == 1) {
                    key = "r";
                } else if (i == 2) {
                    key = "g";
                } else {
                    key = "b";
                }
                System.out.println("Input " + key);
                int input = scanner.nextInt();
                if (input >= 0 && input <= 255) {
                    hashMap.put(key, input);
                } else {
                    i--;
                }
            }
            int color = ((hashMap.get("a") & 0xFF) << 24) |
                    ((hashMap.get("r") & 0xFF) << 16) |
                    ((hashMap.get("g") & 0xFF) << 8) |
                    ((hashMap.get("b") & 0xFF) << 0);
            System.out.println("a, r, g, b = " + hashMap.get("a")
                    + ", " + hashMap.get("r")
                    + ", " + hashMap.get("g")
                    + ", " + hashMap.get("b"));
            System.out.println(color);
            System.out.println("a, r, g, b = " + ((color >> 24) & 0xFF)
                    + ", " + ((color >> 16) & 0xFF)
                    + ", " + ((color >> 8) & 0xFF)
                    + ", " + ((color >> 0) & 0xFF));
        }
    }
}