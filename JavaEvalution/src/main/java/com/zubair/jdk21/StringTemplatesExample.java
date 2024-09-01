package com.zubair.jdk21;

public class StringTemplatesExample {
    public static void main(String[] args) {
        String name = "World";
        String greeting = STR."Hello, \{name}!";
        System.out.println(greeting);  // Output: Hello, World!
    }
}

