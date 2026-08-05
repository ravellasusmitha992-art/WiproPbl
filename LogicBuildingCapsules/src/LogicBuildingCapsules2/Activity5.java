package LogicBuildingCapsules2;
import java.util.Scanner;
public class Activity5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);

	        System.out.print("Enter a number: ");
	        int num = sc.nextInt();

	        for (int i = 2; i <= num; i++) {
	            if (num % i == 0) {
	                System.out.println("Smallest exact divisor other than 1 = " + i);
	                break;
	            }
	        }

	        sc.close();
	    }
	}

	