package com.company;

public class Main {

    public static final String TRIANGLE = "triangle";
    public static final String RECTANGLE = "rectangle";
    public static final String AREA = "area";
    public static final String LAP = "lap";

    public static void main(String[] args) {
        // write your code here
        int value = triangleArea(4, 8);
        log(value, TRIANGLE, AREA);

        value = triangleLap(3, 5, 7);
        log(value, TRIANGLE, LAP);

        value = rectangularArea(8, 3);
        log(value, RECTANGLE, AREA);

        value = rectangularLap(6, 7);
        log(value, RECTANGLE, LAP);
    }

    public static int triangleArea(int a, int h) {
        return (a * h) / 2;
    }

    public static int triangleLap(int a, int b, int c) {
        return a + b + c;
    }

    public static int rectangularArea(int a, int b) {
        return a * b;
    }

    public static int rectangularLap(int a, int b) {
        return 2 * (a + b);
    }

    public static void log(int value, String shape, String calculationType) {
        System.out.println("Result of " + calculationType + " of " + shape + " is " + value);
    }

}
