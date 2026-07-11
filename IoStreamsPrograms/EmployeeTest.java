package Iostreams;

import java.io.*;
import java.util.Date;

public class EmployeeTest {

    public static void main(String[] args) {

        // Create Employee object
        Employee emp = new Employee(
                "Susmitha",
                new Date(),
                "IT",
                "Software Engineer",
                50000.0
        );

        // Serialization
        try {
            FileOutputStream fos = new FileOutputStream("data");
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeObject(emp);

            oos.close();
            fos.close();

            System.out.println("Employee object serialized successfully.");

        } catch (IOException e) {
            e.printStackTrace();
        }

        // Deserialization
        try {
            FileInputStream fis = new FileInputStream("data");
            ObjectInputStream ois = new ObjectInputStream(fis);

            Employee e = (Employee) ois.readObject();

            ois.close();
            fis.close();

            System.out.println("\nEmployee Details:");
            System.out.println("Name: " + e.getName());
            System.out.println("Date of Birth: " + e.getDateOfBirth());
            System.out.println("Department: " + e.getDepartment());
            System.out.println("Designation: " + e.getDesignation());
            System.out.println("Salary: " + e.getSalary());

        } catch (IOException | ClassNotFoundException ex) {
            ex.printStackTrace();
        }
    }
}