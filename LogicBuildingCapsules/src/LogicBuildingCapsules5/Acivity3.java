package LogicBuildingCapsules5;

import java.util.Scanner;

public class Acivity3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[25];

        System.out.println("Enter 25 integers:");

        for (int i = 0; i < 25; i++) {
            arr[i] = sc.nextInt();
        }

        int max = arr[0];

        for (int i = 1; i < 25; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        int firstPos = -1;
        int lastPos = -1;

        for (int i = 0; i < 25; i++) {
            if (arr[i] == max) {
                if (firstPos == -1) {
                    firstPos = i;
                }
                lastPos = i;
            }
        }

        System.out.println("Maximum value: " + max);
        System.out.println("First occurrence (position): " + (firstPos + 1));
        System.out.println("Last occurrence (position): " + (lastPos + 1));
    }
}