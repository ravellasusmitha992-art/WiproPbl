package LambdaExpressions;

import java.util.ArrayList;
import java.util.Collections;

public class ReverseWords {

    public static void main(String[] args) {

        ArrayList<String> al = new ArrayList<>();

        al.add("Java");
        al.add("Python");
        al.add("HTML");
        al.add("CSS");
        al.add("SQL");
        al.add("Spring");
        al.add("React");
        al.add("C");
        al.add("C++");
        al.add("JavaScript");

        Collections.sort(al, (s1, s2) -> s2.compareTo(s1));

        System.out.println("Strings in Reverse Order:");

        al.forEach(str -> System.out.println(str));
    }
}