package Wrapperclasses;

public class CloneDemo {

	static class Employee implements Cloneable {
	    int id;
	    String name;
	    double salary;

	    Employee(int id, String name, double salary) {
	        this.id = id;
	        this.name = name;
	        this.salary = salary;
	    }

	    public Object clone() throws CloneNotSupportedException {
	        return super.clone();
	    }

	    void display() {
	        System.out.println(id + " " + name + " " + salary);
	    }
	}

	    public static void main(String args[]) throws CloneNotSupportedException {

	        Employee e1 = new Employee(101, "Susmitha", 30000);
	        Employee e2 = (Employee) e1.clone();

	        e1.salary = 50000;

	        System.out.println("Original Employee");
	        e1.display();

	        System.out.println("Cloned Employee");
	        e2.display();
	    }
	}