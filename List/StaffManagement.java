package List;

import java.util.*;

public class StaffManagement {

    public static void main(String[] args) {

        Vector<Staff> staffList = new Vector<>();

        staffList.add(new Staff(101, "Rahul", "rahul@gmail.com", "Male", 50000));
        staffList.add(new Staff(102, "Priya", "priya@gmail.com", "Female", 60000));
        staffList.add(new Staff(103, "Kiran", "kiran@gmail.com", "Male", 55000));

        System.out.println("Using Iterator");

        Iterator<Staff> itr = staffList.iterator();
        while (itr.hasNext()) {
            itr.next().display();
            System.out.println("------------------");
        }

        System.out.println("Using Enumeration");

        Enumeration<Staff> en = staffList.elements();
        while (en.hasMoreElements()) {
            en.nextElement().display();
            System.out.println("------------------");
        }
    }
}