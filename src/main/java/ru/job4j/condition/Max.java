package ru.job4j.condition;

public class Max {

    public static int max(int number1, int number2) {
        return number1 > number2 ? number1 : number2;
    }

    public static int max(int number1, int number2, int number3) {
        return max(number1, max(number2, number3));
    }

    public static int max(int number1, int number2, int number3, int number4) {
        return max(number1, max(number2, number3, number4));
    }

    public static void main(String[] args) {
        System.out.println(Max.max(50, 10));
        System.out.println(Max.max(50, 10, 100));
        System.out.println(Max.max(50, 10, 100, 1000));
    }
}
