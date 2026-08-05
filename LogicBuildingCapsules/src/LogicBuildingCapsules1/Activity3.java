package LogicBuildingCapsules1;

import java.util.Scanner;

public class Activity3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int positiveCount = 0;
        int negativeCount = 0;

        for (int i = 1; i <= 5; i++) {

            System.out.print("Enter number " + i + ": ");
            int num = sc.nextInt();

            if (num >= 0) {
                positiveCount++;
            } else if (num < 0) {
                negativeCount++;
            }
        }

        System.out.println("Positive numbers count = " + positiveCount);
        System.out.println("Negatitive numbers count = " + negativeCount);
       

        sc.close();
    }
}