package ru.job4j.loop;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class CounterTest {

    @Test
    void when0To10Then55() {
        int expexted = 55;
        int start = 0;
        int finish = 10;
        int output = Counter.sum(start, finish);
        assertThat(output).isEqualTo(expexted);
    }

    @Test
    void when3To8Then33() {
        int expexted = 33;
        int start = 3;
        int finish = 8;
        int output = Counter.sum(start, finish);
        assertThat(output).isEqualTo(expexted);
    }

    @Test
    void when1To1Then1() {
        int expexted = 1;
        int start = 1;
        int finish = 1;
        int output = Counter.sum(start, finish);
        assertThat(output).isEqualTo(expexted);
    }

    @Test
    void when10To1Then0() {
        int expexted = 0;
        int start = 10;
        int finish = 1;
        int output = Counter.sum(start, finish);
        assertThat(output).isEqualTo(expexted);
    }

    @Test
    void when0To0Then0() {
        int expexted = 0;
        int start = 0;
        int finish = 0;
        int output = Counter.sum(start, finish);
        assertThat(output).isEqualTo(expexted);
    }

    @Test
    void whenSumEvenNumbersFromOneToTenThenThirty() {
        int start = 1;
        int finish = 10;
        int result = Counter.sumByEven(start, finish);
        int expected = 30;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenSumEvenNumbersFromTenToEighteenThenSeventy() {
        int start = 10;
        int finish = 18;
        int result = Counter.sumByEven(start, finish);
        int expected = 70;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenSumEvenNumbersFromMinusOneToTenThenThirty() {
        int start = -1;
        int finish = 10;
        int result = Counter.sumByEven(start, finish);
        int expected = 30;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenSumEvenNumbersFromMinusOneToMinusTenThenZero() {
        int start = -1;
        int finish = -10;
        int result = Counter.sumByEven(start, finish);
        int expected = 0;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenSumEvenNumbersFromMinusTwentyToMinusTenThenMinusNinety() {
        int start = -20;
        int finish = -10;
        int result = Counter.sumByEven(start, finish);
        int expected = -90;
        assertThat(result).isEqualTo(expected);
    }
}