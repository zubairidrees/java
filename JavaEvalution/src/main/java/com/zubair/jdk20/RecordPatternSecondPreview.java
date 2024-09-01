package com.zubair.jdk20;

public class RecordPatternSecondPreview {
    public static void main(String[] args) {
        // Create some sample points
        Point p1 = new Point(1, 2);
        Point p2 = new Point(3, 4);
        Object obj = p1;

        // Pattern matching using record patterns
        if (obj instanceof Point(int x, int y)) {
            System.out.println("x: " + x + ", y: " + y);
        }

        // Using record patterns in a switch statement
        Object result = switch (p2) {
            case Point(int x, int y) -> "Point with coordinates: (" + x + ", " + y + ")";
            default -> "Unknown";
        };

        System.out.println(result);
    }

    // Record class definition
    record Point(int x, int y) {}
}

