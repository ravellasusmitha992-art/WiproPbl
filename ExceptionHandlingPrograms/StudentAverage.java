package Exceptionhandling;
class NegativeMarksException extends Exception {
    public NegativeMarksException(String msg) {
        super(msg);
    }
}

class InvalidMarksException extends Exception {
    public InvalidMarksException(String msg) {
        super(msg);
    }
}

public class StudentAverage {

    public static void validateMarks(int marks)
            throws NegativeMarksException, InvalidMarksException {

        if (marks < 0)
            throw new NegativeMarksException("Negative marks are not allowed");

        if (marks > 100)
            throw new InvalidMarksException("Marks should be between 0 and 100");
    }

    public static void main(String[] args) {

        try {

            String student1 = "Susmitha";
            int s1m1 = 80, s1m2 = 90, s1m3 = 85;

            validateMarks(s1m1);
            validateMarks(s1m2);
            validateMarks(s1m3);

            double avg1 = (s1m1 + s1m2 + s1m3) / 3.0;

            System.out.println("Student: " + student1);
            System.out.println("Average = " + avg1);

            String student2 = "Anu";
            int s2m1 = 70, s2m2 = 60, s2m3 = 75;

            validateMarks(s2m1);
            validateMarks(s2m2);
            validateMarks(s2m3);

            double avg2 = (s2m1 + s2m2 + s2m3) / 3.0;

            System.out.println("Student: " + student2);
            System.out.println("Average = " + avg2);

        } catch (NegativeMarksException | InvalidMarksException e) {
            System.out.println(e.getMessage());
        }
    }
}
