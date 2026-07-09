package Exceptionhandling;
class PersonException extends Exception {

    public PersonException(String message) {
        super(message);
    }
}

public class Person {

    public static void main(String[] args) {

        try {

            if (args.length != 2) {
                throw new PersonException("Please pass Name and Age as command line arguments");
            }

            String name = args[0];
            int age = Integer.parseInt(args[1]);

            if (age < 18 || age >= 60) {
                throw new PersonException("Age should be >=18 and <60");
            }

            System.out.println("Name : " + name);
            System.out.println("Age : " + age);

        } catch (NumberFormatException e) {
            System.out.println("Age should be an integer");
        } catch (PersonException e) {
            System.out.println(e.getMessage());
        }
    }
}
