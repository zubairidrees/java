package com.zubair.jdk13;

public class SwitchExpressionsExample {
    public static void main(String[] args) {
        String s = "Bar";
        int result = switch (s) {
            case "Foo" -> 1;
            case "Bar" -> {
                System.out.println("Bar case executed");
                yield 2;
            }
            default -> 0;
        };
        System.out.println("Result: " + result);
    }
}
