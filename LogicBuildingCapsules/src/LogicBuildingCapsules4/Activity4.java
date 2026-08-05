package LogicBuildingCapsules4;
import java.util.Scanner;

public class Activity4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            boolean counted = false;

            for (int j = 0; j < i; j++) {
                if (str.charAt(j) == ch) {
                    counted = true;
                    break;
                }
            }

            if (!counted) {
                int count = 0;
                for (int j = 0; j < str.length(); j++) {
                    if (str.charAt(j) == ch) {
                        count++;
                    }
                }
                System.out.println(ch + " - " + count);
            }
        }

        sc.close();
	}

}
