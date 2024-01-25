package ru.job4j.condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        double result = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
        return  result;
    }

    public static void main(String[] args) {
        double result = Point.distance(0, 0, 2, 0);
        System.out.println("result (0, 0) to (2, 0) " + result);
        result = Point.distance(5, 7, 8, 3);
        System.out.println("result (5, 7) to (8, 3) " + result);
        result = Point.distance(5, 4, 2, 9);
        System.out.println("result (5, 4) to (2, 9) " + result);
    }
}