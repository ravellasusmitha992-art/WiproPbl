package List;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();

        list.add("Java");
        list.add("Python");
        list.add("C");
        list.add("C++");

        Iterator<String> itr = list.iterator();

        while(itr.hasNext()) {

            System.out.println(itr.next());
        }
    }
}