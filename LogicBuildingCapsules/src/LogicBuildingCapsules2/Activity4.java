package LogicBuildingCapsules2;
import java.util.Scanner;

public class Activity4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		

		        Scanner sc = new Scanner(System.in);

		        System.out.print("Enter a binary number: ");
		        String binary = sc.next();

		        int decimal = Integer.parseInt(binary, 2);

		        System.out.println("Decimal equivalent = " + decimal);

		        sc.close();
		    }
		}
	