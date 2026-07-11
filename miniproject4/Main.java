package Project4;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.println("\nMain Menu");
            System.out.println("1. Add an Employee");
            System.out.println("2. Display All");
            System.out.println("3. Exit");

            int choice = sc.nextInt();

            switch (choice) {

            case 1:

                System.out.print("Enter Employee ID: ");
                int id = sc.nextInt();

                sc.nextLine();

                System.out.print("Enter Employee Name: ");
                String name = sc.nextLine();

                System.out.print("Enter Employee Age: ");
                int age = sc.nextInt();

                System.out.print("Enter Employee Salary: ");
                double salary = sc.nextDouble();

                Employee emp = new Employee(id, name, age, salary);

                EmployeeManager.addEmployee(emp);

                break;

            case 2:

                EmployeeManager.displayEmployees();

                break;

            case 3:

                System.out.println("Thank You");
                System.exit(0);

            default:

                System.out.println("Invalid Choice");
            }
        }
    }
}