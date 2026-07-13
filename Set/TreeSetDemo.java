package Set;

import java.util.TreeSet;
import java.util.Iterator;

public class TreeSetDemo {

    public static void main(String[] args) {

        TreeSet<String> ts = new TreeSet<>();

        ts.add("Java");
        ts.add("Python");
        ts.add("C");
        ts.add("C++");
        ts.add("HTML");

        System.out.println("Original TreeSet");
        System.out.println(ts);

        System.out.println("Reverse Order");
        System.out.println(ts.descendingSet());

        System.out.println("Iterator");

        Iterator<String> itr = ts.iterator();

        while(itr.hasNext()) {
            System.out.println(itr.next());
        }

        System.out.println("Contains Java : " + ts.contains("Java"));
        System.out.println("Contains SQL : " + ts.contains("SQL"));
    }
}