package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class PointTest {

    @Test
    void when00to20then2() {
        double expected = 2;
        Point a = new Point(0, 0);
        Point b = new Point(0, 2);
        double output = a.distance(b);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when7Minus4to8Minus1then3Dot16() {
        double expected = 3.16;
        Point a = new Point(7, -4);
        Point b = new Point(8, -1);
        double output = a.distance(b);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenMinus6Minus9to4Minus12then10Dot44() {
        double expected = 10.44;
        Point a = new Point(-6, -9);
        Point b = new Point(4, -12);
        double output = a.distance(b);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when55toMinus5Minus5then14Dot14() {
        double expected = 14.14;
        Point a = new Point(5, 5);
        Point b = new Point(-5, -5);
        double output = a.distance(b);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }
}