package net.silve;

import java.util.stream.Stream;

public class FizzBuzz {

    private static final String[] FIZZ_CYCLE = new String[]{"", "", "fizz"};
    private static final String[] BUZZ_CYCLE = new String[]{"", "", "", "", "buzz"};

    private FizzBuzz() {
    }

    public static String[] shout(int max) {
        return Stream.iterate(0, i -> i + 1)
                .limit(max)
                .map(FizzBuzz::apply)
                .toArray(String[]::new);
    }

    private static String apply(Integer i) {
        String s = FIZZ_CYCLE[i % 3];
        s = s + BUZZ_CYCLE[i % 5];
        s = s.isEmpty() ? String.valueOf(i + 1) : s;
        return s;
    }
}
