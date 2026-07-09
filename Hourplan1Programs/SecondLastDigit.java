package Hourplanm1;

public class SecondLastDigit {

    public static int secondLastDigit(int n) {

        n = Math.abs(n);

        if (n < 10) {
            return -1;
        }

        return (n / 10) % 10;
    }

    public static void main(String[] args) {

        int num = -197;

        System.out.println(secondLastDigit(num));
    }
}