package OptionalClass;

import java.util.Optional;

public class TestEmployee {
    public static void main(String[] args) {

        Employee emp = null;

        try {
            Optional.ofNullable(emp)
                    .orElseThrow(() -> new InvalidEmployeeException("Invalid Employee"));

            System.out.println("Employee Name: " + emp.name);

        } catch (InvalidEmployeeException e) {
            System.out.println(e.getMessage());
        }
    }
}