package LogicBuildingCapsules5;

import java.util.Scanner;

public class Activity4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[15];

        System.out.println("Enter 15 integers:");
        for (int i = 0; i < 15; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter the number to search: ");
        int x = sc.nextInt();

        boolean found = false;

        for (int i = 0; i < 15; i++) {
            if (arr[i] == x) {
                System.out.println("Number found at position: " + (i + 1));
                found = true;
            }
        }

        if (!found) {
            System.out.println("Number not found in the array.");
        }

        sc.close();
    }
}