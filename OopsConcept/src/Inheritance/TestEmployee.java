package Inheritance;

public class TestEmployee {
    public static void main(String[] args) {

        Employee emp = new Employee(
                "Rahul",
                500000.0,
                2023,
                "NI12345");

        System.out.println("Name: " + emp.getName());
        System.out.println("Annual Salary: " + emp.getAnnualSalary());
        System.out.println("Year Started: " + emp.getYearStarted());
        System.out.println("National Insurance Number: " + emp.getNationalInsuranceNumber());
    }
}