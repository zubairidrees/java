package com.zubair.jdk11;

import java.util.List;

public class LocalVariableSyntaxLambdaExample {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5);
        numbers.forEach((var number) -> System.out.println(number));
    }
}
