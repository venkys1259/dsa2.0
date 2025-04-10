package com.practice.misc;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Name {
    public static void main(String[] args) {
        while (true) {
            Scanner myObj = new Scanner(System.in);
            System.out.println("Enter username");
            Map<Character, Integer> charMap = new HashMap<>();
            int value = 1, output = 0;
            for (char ch = 'A'; ch <= 'I'; ++ch) {
                charMap.put(ch, value++);
            }
            value = 1;
            for (char ch = 'J'; ch <= 'R'; ++ch) {
                charMap.put(ch, value++);
            }
            value = 1;
            for (char ch = 'S'; ch <= 'Z'; ++ch) {
                charMap.put(ch, value++);
            }
            char[] ch = myObj.next().toUpperCase().toCharArray();
            for (char c : ch) {
                output += charMap.get(c);
            }
            System.out.println(output);
        }
    }

}
