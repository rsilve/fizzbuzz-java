package net.silve;

public class FizzBuzz {

    private static final String FIZZ = "fizz";
    private static final String BUZZ = "buzz";

    private FizzBuzz() {}

    public static String[] shout(int max) {
        String[] fizzbuzzOrNumber = new String[max];
        for (int i = 0; i < max; i++) {
            int value = i + 1;
            fizzbuzzOrNumber[i] = String.valueOf(value);
            if (value % 3 == 0) {
                fizzbuzzOrNumber[i] = FIZZ;
            }
            if (value % 5 == 0) {
                if (fizzbuzzOrNumber[i].equals(FIZZ)) {
                    fizzbuzzOrNumber[i] = fizzbuzzOrNumber[i] + BUZZ;
                } else {
                    fizzbuzzOrNumber[i] = BUZZ;
                }
            }
        }
        return fizzbuzzOrNumber;
    }
}
