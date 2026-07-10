package Wrapperclasses;


	import java.util.Scanner;
	public class BinaryConverter {

	    public static void main(String args[]) {

	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter number: ");
	        int n = sc.nextInt();

	        String binary = Integer.toBinaryString(n);
	        binary = String.format("%8s", binary).replace(' ', '0');

	        System.out.println("Binary : " + binary);
	    }
	}