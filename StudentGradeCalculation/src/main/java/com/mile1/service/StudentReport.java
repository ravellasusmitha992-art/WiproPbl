package com.mile1.service;

import com.mile1.bean.Student;
import com.mile1.exception.NullMarksArrayException;
import com.mile1.exception.NullNameException;
import com.mile1.exception.NullStudentException;

public class StudentReport {

    public String validate(Student student)
            throws NullStudentException, NullNameException, NullMarksArrayException {

        if (student == null)
            throw new NullStudentException();

        if (student.getName() == null)
            throw new NullNameException();

        if (student.getMarks() == null)
            throw new NullMarksArrayException();

        int[] marks = student.getMarks();

        for (int mark : marks) {
            if (mark < 35)
                return "F";
        }

        return "PASS";
    }

    public String findGrades(Student student)
            throws NullStudentException, NullNameException, NullMarksArrayException {

        String result = validate(student);

        if (result.equals("F"))
            return "F";

        int total = 0;
        int[] marks = student.getMarks();

        for (int mark : marks) {
            total += mark;
        }

        double avg = total / marks.length;

        if (avg >= 80)
            return "A";
        else if (avg >= 60)
            return "B";
        else
            return "C";
    }
}