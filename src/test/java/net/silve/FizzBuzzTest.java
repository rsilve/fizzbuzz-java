package net.silve;

import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest {

    @Test
    void shouldReturnListOfInt() {
        String[] res = FizzBuzz.shout(2);
        assertArrayEquals(new String[]{"1", "2"}, res);
    }

    @Test
    void shouldFizzFor3() {
        String[] res = FizzBuzz.shout(3);
        assertEquals("fizz", res[2]);
    }

    @Test
    void shouldFizzForNx3() {
        Random random = new Random();
        int max = random.nextInt(0, 1000) * 3;
        String[] res = FizzBuzz.shout(max);
        assertTrue(res[max - 1].startsWith("fizz"));
    }

    @Test
    void shouldBuzzFor5() {
        String[] res = FizzBuzz.shout(5);
        assertEquals("buzz", res[4]);
    }

    @Test
    void shouldBuzzForNx5() {
        Random random = new Random();
        int max = random.nextInt(0, 1000) * 5;
        String[] res = FizzBuzz.shout(max);
        assertTrue(res[max - 1].endsWith("buzz"));
    }

    @Test
    void shouldFizzBuzzForNx5x3() {
        Random random = new Random();
        int max = random.nextInt(0, 1000) * 5 * 3;
        String[] res = FizzBuzz.shout(max);
        assertEquals("fizzbuzz", res[max - 1]);
    }

}