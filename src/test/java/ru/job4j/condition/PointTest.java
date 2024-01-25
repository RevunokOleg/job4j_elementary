package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class PointTest {

    @Test
    void when00to20then2() {
        double expected = 2;
        int x1 = 0;
        int y1 = 0;
        int x2 = 2;
        int y2 = 0;
        double output = Point.distance(x1, y1, x2, y2);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when7Minus4to8Minus1then3Dot16() {
        double expected = 3.16;
        int x1 = 7;
        int y1 = -4;
        int x2 = 8;
        int y2 = -1;
        double output = Point.distance(x1, y1, x2, y2);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenMinus6Minus9to4Minus12then10Dot44() {
        double expected = 10.44;
        int x1 = -6;
        int y1 = -9;
        int x2 = 4;
        int y2 = -12;
        double output = Point.distance(x1, y1, x2, y2);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when55toMinus5Minus5then14Dot14() {
        double expected = 14.14;
        int x1 = 5;
        int y1 = 5;
        int x2 = -5;
        int y2 = -5;
        double output = Point.distance(x1, y1, x2, y2);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }
}