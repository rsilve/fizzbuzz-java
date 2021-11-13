package net.silve;

import java.util.stream.Stream;

public class FizzBuzz {

    private static final String FIZZ = "fizz";
    private static final String BUZZ = "buzz";

    private FizzBuzz() {
    }

    public static String[] shout(int max) {
        return Stream.iterate(0, i -> i + 1)
                .limit(max)
                .map(FizzBuzz::fizzbuzzOrNumber)
                .toArray(String[]::new);
    }

    private static String fizzbuzzOrNumber(int i) {
        String fizzbuzzOrNumber;
        int value = i + 1;
        fizzbuzzOrNumber = String.valueOf(value);
        if (value % 3 == 0) {
            fizzbuzzOrNumber = FIZZ;
        }
        if (value % 5 == 0) {
            if (fizzbuzzOrNumber.equals(FIZZ)) {
                fizzbuzzOrNumber = fizzbuzzOrNumber + BUZZ;
            } else {
                fizzbuzzOrNumber = BUZZ;
            }
        }
        return fizzbuzzOrNumber;
    }
}
