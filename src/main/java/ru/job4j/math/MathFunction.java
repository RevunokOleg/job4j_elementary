package ru.job4j.math;

public class MathFunction {

    public static double sum(double first, double second) {
        return first + second;
    }

    public static double multiply(double first, double second) {
        return first * second;
    }

    public static double subtract(double first, double second) {
        return first - second;
    }

    public static double divide(double first, double second) {
        return first / second;
    }

    public static void main(String[] args) {
        System.out.println(sum(5, 10));
        System.out.println(multiply(5, 10));
        System.out.println(subtract(5, 10));
        System.out.println(divide(5, 10));
    }
}
