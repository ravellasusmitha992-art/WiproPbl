package com.mile1.service;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.mile1.bean.Student;
import com.mile1.exception.NullMarksArrayException;
import com.mile1.exception.NullNameException;
import com.mile1.exception.NullStudentException;

public class StudentServiceTest {

    StudentService service = new StudentService();

    // Test Case 1
    @Test
    public void testGradeA() throws Exception {

        Student[] students = {
            new Student("Sekhar",
                    new int[]{85, 75, 95})
        };

        String[] result =
                service.findGrades(students);

        assertEquals("A", result[0]);
    }

    // Test Case 2
    @Test
    public void testGradeB() throws Exception {

        Student[] students = {
            new Student("Ravi",
                    new int[]{75, 80, 78})
        };

        String[] result =
                service.findGrades(students);

        assertEquals("B", result[0]);
    }

    // Test Case 3
    @Test
    public void testGradeC() throws Exception {

        Student[] students = {
            new Student("Anu",
                    new int[]{60, 65, 62})
        };

        String[] result =
                service.findGrades(students);

        assertEquals("C", result[0]);
    }

    // Test Case 4
    @Test
    public void testGradeD() throws Exception {

        Student[] students = {
            new Student("Ram",
                    new int[]{50, 55, 52})
        };

        String[] result =
                service.findGrades(students);

        assertEquals("D", result[0]);
    }

    // Test Case 5
    @Test
    public void testGradeF() throws Exception {

        Student[] students = {
            new Student("Kiran",
                    new int[]{30, 40, 45})
        };

        String[] result =
                service.findGrades(students);

        assertEquals("F", result[0]);
    }

    // Test Case 6
    @Test(expected = NullStudentException.class)
    public void testNullStudent() throws Exception {

        Student[] students = {null};

        service.findGrades(students);
    }

    // Test Case 7
    @Test(expected = NullNameException.class)
    public void testNullName() throws Exception {

        Student[] students = {
            new Student(null,
                    new int[]{80, 85, 90})
        };

        service.findGrades(students);
    }

    // Test Case 8
    @Test(expected = NullMarksArrayException.class)
    public void testNullMarksArray() throws Exception {

        Student[] students = {
            new Student("Ravi", null)
        };

        service.findGrades(students);
    }

    // Test Case 9
    @Test
    public void testNumberOfNullObjects() {

        Student[] students = {
            new Student("A",
                    new int[]{80, 80, 80}),
            null,
            null
        };

        assertEquals(2,
                service.findNumberOfNullObjects(students));
    }
}