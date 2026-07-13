package StreamApi;

public class Student {

    int rollNo;
    String name;
    int mark;

    public Student(int rollNo, String name, int mark) {
        this.rollNo = rollNo;
        this.name = name;
        this.mark = mark;
    }

    public void display() {
        System.out.println("Roll No : " + rollNo);
        System.out.println("Name    : " + name);
        System.out.println("Marks   : " + mark);
        System.out.println("----------------------");
    }
}