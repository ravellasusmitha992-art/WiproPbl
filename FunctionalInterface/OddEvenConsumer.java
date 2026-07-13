package FuctionalInterface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Consumer;

public class OddEvenConsumer {

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>(
                Arrays.asList(2, 5, 8, 11, 14, 17, 20, 25, 30, 33));

        Consumer<Integer> check = n -> {
            if (n % 2 == 0)
                System.out.println(n + " Even");
            else
                System.out.println(n + " Odd");
        };

        numbers.forEach(check);
    }
}