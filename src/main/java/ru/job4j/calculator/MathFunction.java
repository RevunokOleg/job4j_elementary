package ru.job4j.calculator;

public class MathFunction {

    public static int mult(int x) {
        int y = x * x + 1;
        return y;
    }

    public static int div(int x) {
        int y = 1 / x;
        return y;
    }

    public static void main(String[] args) {
        int mult = MathFunction.mult(3);
        int div = MathFunction.div(5);
        int total = mult + div;
        int mult100 = MathFunction.mult(100);
        System.out.println(total);
        System.out.println(mult100);
    }
}