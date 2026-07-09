package Hourplanm1;

public class LastDigit {

    public static int lastDigit(int n) {

        return Math.abs(n % 10);
    }

    public static void main(String[] args) {

        int num = -197;

        System.out.println(lastDigit(num));
    }
}