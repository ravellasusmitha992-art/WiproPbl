package List;

import java.util.ArrayList;

public class NumberList {

    public static void main(String[] args) {

        ArrayList<Number> numbers = new ArrayList<>();

        numbers.add(10);
        numbers.add(20.5);
        numbers.add(30.75f);
        numbers.add(100L);

        System.out.println("Numbers:");

        for(Number n : numbers) {
            System.out.println(n);
        }
    }
}