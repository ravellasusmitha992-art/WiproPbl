package com.mile1.service;

import com.mile1.bean.Student;
import com.mile1.exception.NullMarksArrayException;
import com.mile1.exception.NullNameException;
import com.mile1.exception.NullStudentException;

public class StudentService {

    public String[] findGrades(Student[] students)
            throws NullStudentException,
                   NullNameException,
                   NullMarksArrayException {

        String[] grades = new String[students.length];

        for (int i = 0; i < students.length; i++) {

            // Check for null Student object
            if (students[i] == null) {
                throw new NullStudentException("Student is null");
            }

            // Check for null Student name
            if (students[i].getName() == null) {
                throw new NullNameException("Name is null");
            }

            // Check for null marks array
            if (students[i].getMarks() == null) {
                throw new NullMarksArrayException("Marks array is null");
            }

            // Calculate total marks
            int total = 0;

            for (int mark : students[i].getMarks()) {
                total = total + mark;
            }

            // Calculate average
            double average =
                    (double) total / students[i].getMarks().length;

            // Calculate grade
            String grade;

            if (average >= 80) {
                grade = "A";
            } else if (average >= 70) {
                grade = "B";
            } else if (average >= 60) {
                grade = "C";
            } else if (average >= 50) {
                grade = "D";
            } else {
                grade = "F";
            }

            // Store grade in Student object
            students[i].setGrade(grade);

            // Store grade in result array
            grades[i] = grade;
        }

        return grades;
    }


    public int findNumberOfNullObjects(Student[] students) {

        int count = 0;

        for (Student student : students) {

            if (student == null) {
                count++;
            }
        }

        return count;
    }


    public int findNumberOfNullNames(Student[] students) {

        int count = 0;

        for (Student student : students) {

            if (student != null &&
                    student.getName() == null) {

                count++;
            }
        }

        return count;
    }


    public int findNumberOfNullMarksArray(Student[] students) {

        int count = 0;

        for (Student student : students) {

            if (student != null &&
                    student.getMarks() == null) {

                count++;
            }
        }

        return count;
    }
}