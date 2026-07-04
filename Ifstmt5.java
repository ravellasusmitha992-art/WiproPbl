package Controlstatements;

public class Ifstmt5 {

    public static void main(String[] args) {

        char ch = args[0].charAt(0);

        if((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
            System.out.println("Alphabet");
        }
        else if(ch >= '0' && ch <= '9') {
            System.out.println("Digit");
        }
        else {
            System.out.println("Special Character");
        }
    }
}