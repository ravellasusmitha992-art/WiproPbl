package List;

public class Staff {

    int empId;
    String empName;
    String email;
    String gender;
    float salary;

    public Staff(int empId, String empName, String email, String gender, float salary) {
        this.empId = empId;
        this.empName = empName;
        this.email = email;
        this.gender = gender;
        this.salary = salary;
    }

    public void display() {
        System.out.println("Employee ID : " + empId);
        System.out.println("Employee Name : " + empName);
        System.out.println("Email : " + email);
        System.out.println("Gender : " + gender);
        System.out.println("Salary : " + salary);
    }
}