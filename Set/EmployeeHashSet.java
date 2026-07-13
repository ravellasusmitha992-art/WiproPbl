package Set;

import java.util.HashSet;
import java.util.Iterator;

public class EmployeeHashSet {

    public static void main(String[] args) {

        HashSet<String> employees = new HashSet<>();

        employees.add("Rahul");
        employees.add("Priya");
        employees.add("Kiran");
        employees.add("Sneha");
        employees.add("Ravi");

        Iterator<String> itr = employees.iterator();

        while(itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}