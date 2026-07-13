package StreamApi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StudentDemo {

    public static void main(String[] args) {

        ArrayList<Student> students = new ArrayList<>();

        students.add(new Student(101, "Rahul", 75));
        students.add(new Student(102, "Priya", 48));
        students.add(new Student(103, "Kiran", 90));
        students.add(new Student(104, "Sneha", 55));
        students.add(new Student(105, "Ravi", 35));

        List<Student> passedStudents = students.stream()
                .filter(s -> s.mark >= 50)
                .collect(Collectors.toList());

        System.out.println("Students who passed:");

        passedStudents.forEach(Student::display);

        System.out.println("Total Passed Students = " + passedStudents.size());
    }
}