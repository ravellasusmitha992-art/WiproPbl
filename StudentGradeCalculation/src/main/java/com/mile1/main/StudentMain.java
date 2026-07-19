package com.mile1.main;

import com.mile1.bean.Student;
import com.mile1.service.StudentService;

public class StudentMain {

    public static void main(String[] args) throws Exception {

        Student[] data = new Student[4];

        data[0] = new Student("Sekhar", new int[] {85, 75, 95});
        data[1] = new Student("Ravi", new int[] {30, 65, 70});
        data[2] = new Student(null, new int[] {90, 85, 80});
        data[3] = null;

        StudentService service = new StudentService();

        String[] grades = service.findGrades(data);

        System.out.println("Grades:");

        for (int i = 0; i < grades.length; i++) {
            System.out.println(grades[i]);
        }

        System.out.println("\nNull Objects : "
                + service.findNumberOfNullObjects(data));

        System.out.println("Null Names : "
                + service.findNumberOfNullNames(data));

        System.out.println("Null Marks Arrays : "
                + service.findNumberOfNullMarksArray(data));
    }
}