package com.zubair.jdk11;

public class StringMethodsExample {
    public static void main(String[] args) {
        String text = "   Hello, Java 11!   ";
        System.out.println("Repeating text: " + text.repeat(3));
        System.out.println("Is blank? " + text.isBlank());
        System.out.println("Lines:");
        text = """
                Hello, Java 11!
                Hello, Java 11!
                Hello, Java 11!
                """;
        text.lines().forEach(System.out::println);
    }
}
