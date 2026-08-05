package LogicBuildingCapsules4;
import java.util.Scanner;

public class Activity2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        boolean found = false;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
                ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                System.out.print('z');
                found = true;
            } else {
                System.out.print(ch);
            }
        }

        if (!found) {
            System.out.println("\nNo vowels present");
        }

        sc.close();

	}

}
