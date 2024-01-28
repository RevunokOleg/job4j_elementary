package ru.job4j.condition;

public class ThreeMax {

    public static int max(int first, int second, int third) {
        int result = first;
        if (first <= second && second >= third) {
            result = second;
        }
        if (second <= third && third >= first) {
            result = third;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(max(1, 2, 3));
        System.out.println(max(1, 3, 2));
        System.out.println(max(3, 2, 1));
        System.out.println(max(1, 1, 1));
        System.out.println(max(1, 2, 2));
        System.out.println(max(1, 2, 1));
        System.out.println(max(1, 1, 2));
    }
}
