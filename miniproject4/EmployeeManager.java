package Project4;
import java.io.*;
import java.util.*;

public class EmployeeManager {

    static final String FILE_NAME = "employee.dat";

    public static void addEmployee(Employee emp) {

        try {
            FileOutputStream fos = new FileOutputStream(FILE_NAME, true);
            ObjectOutputStream oos;

            if (new File(FILE_NAME).length() == 0)
                oos = new ObjectOutputStream(fos);
            else
                oos = new AppendableObjectOutputStream(fos);

            oos.writeObject(emp);
            oos.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void displayEmployees() {

        try {

            FileInputStream fis = new FileInputStream(FILE_NAME);
            ObjectInputStream ois = new ObjectInputStream(fis);

            System.out.println("-----Report-----");

            while (true) {
                Employee e = (Employee) ois.readObject();

                System.out.println(e.getId() + " "
                        + e.getName() + " "
                        + e.getAge() + " "
                        + e.getSalary());
            }

        } catch (EOFException e) {

            System.out.println("-----End of Report-----");

        } catch (Exception e) {
            System.out.println("No Records Found.");
        }
    }
}

class AppendableObjectOutputStream extends ObjectOutputStream {

    AppendableObjectOutputStream(OutputStream out) throws IOException {
        super(out);
    }

    protected void writeStreamHeader() throws IOException {
        reset();
    }
}