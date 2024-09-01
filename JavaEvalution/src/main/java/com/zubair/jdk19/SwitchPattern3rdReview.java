package com.zubair.jdk19;

public class SwitchPattern3rdReview {

    public static void main(String[] args) {
        System.out.println(formatter(10));
        System.out.println(formatter(-10));
    }

    static String formatter(Object o) {
        return switch (o) {
            case Integer i when i > 0 -> String.format("Positive int %d", i);
            case Integer i -> String.format("int %d", i);
            case Long l when l > 0 -> String.format("Positive long %d", l);
            case Long l -> String.format("long %d", l);
            case Double d -> String.format("double %f", d);
            case String s -> String.format("String %s", s);
            default -> "Unknown";
        };

    }

}
