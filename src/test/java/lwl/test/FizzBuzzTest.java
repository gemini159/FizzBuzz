package lwl.test;

import java.util.ArrayList;

public class FizzBuzzTest {

    @org.junit.Test
    public void fizz() {
        ArrayList<String> fizz = FizzBuzz.fizz(100);
        for (String s : fizz) {
            System.out.println(s);
        }
    }
}