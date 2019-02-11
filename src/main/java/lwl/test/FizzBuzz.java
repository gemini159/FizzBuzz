package lwl.test;

import java.util.ArrayList;

public class FizzBuzz {

    private static final String DIV3 = "Fizz";
    private static final String DIV5 = "Buzz";
    private static final String DIV35 = "FizzBuzz";

    public static ArrayList<String> fizz(int n) {

        ArrayList<String> list = new ArrayList<>();

        for (int i = 1; i <= n; i++) {

            boolean isDiv3 = i % 3 == 0;
            boolean isDiv5 = i % 5 == 0;

            if (isDiv3 && isDiv5) {
                list.add(DIV35);
            } else if (isDiv3) {
                list.add(DIV3);
            } else if (isDiv5) {
                list.add(DIV5);
            } else {
                list.add(String.valueOf(i));
            }
        }
        return list;
    }
}
