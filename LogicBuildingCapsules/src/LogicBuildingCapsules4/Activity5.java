package LogicBuildingCapsules4;
import java.util.Scanner;
public class Activity5 {
	
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        String str1 = sc.nextLine();
	        String str2 = sc.nextLine();

	        String rev = "";

	        for (int i = str2.length() - 1; i >= 0; i--) {
	            rev = rev + str2.charAt(i);
	        }

	        System.out.println(str1 + rev);

	        sc.close();

	

	}

}
