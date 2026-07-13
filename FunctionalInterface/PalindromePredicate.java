package FuctionalInterface;

import java.util.ArrayList;
import java.util.function.Predicate;

public class PalindromePredicate {

    public static void main(String[] args) {

        ArrayList<String> words = new ArrayList<>();

        words.add("madam");
        words.add("java");
        words.add("level");
        words.add("hello");
        words.add("radar");
        words.add("apple");
        words.add("noon");
        words.add("world");
        words.add("civic");
        words.add("program");

        Predicate<String> isPalindrome = str -> {
            String rev = new StringBuilder(str).reverse().toString();
            return str.equalsIgnoreCase(rev);
        };

        System.out.println("Palindrome Words:");

        words.stream()
             .filter(isPalindrome)
             .forEach(System.out::println);
    }
}