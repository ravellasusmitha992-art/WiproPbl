package LogicBuildingCapsules3;

import java.util.Scanner;

public class Activity4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int marks[] = new int[30];

        System.out.println("Enter 30 marks:");

        for (int i = 0; i < 30; i++) {
            marks[i] = sc.nextInt();
        }

        for (int i = 0; i <= 100; i++) {
            int count = 0;

            for (int j = 0; j < 30; j++) {
                if (marks[j] == i) {
                    count++;
                }
            }

            if (count > 0) {
                System.out.println(i + " = " + count);
            }
        }

        sc.close();
    }
}