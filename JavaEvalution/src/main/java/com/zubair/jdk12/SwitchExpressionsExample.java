package com.zubair.jdk12;

public class SwitchExpressionsExample {
    public static void main(String[] args) {
        int day = 3;
        String dayName = switch (day) {
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            default -> "Unknown";
        };
        System.out.println("Day is: " + dayName);
    }
}
