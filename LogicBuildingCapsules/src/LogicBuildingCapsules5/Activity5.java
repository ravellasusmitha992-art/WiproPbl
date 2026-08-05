package LogicBuildingCapsules5;

import java.util.Scanner;

public class Activity5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr1 = new int[5];
        int[] arr2 = new int[5];

        System.out.println("Enter 5 integers for the first array:");
        for (int i = 0; i < 5; i++) {
            arr1[i] = sc.nextInt();
        }

        System.out.println("Enter 5 integers for the second array:");
        for (int i = 0; i < 5; i++) {
            arr2[i] = sc.nextInt();
        }

    
        for (int i = 0; i < arr1.length - 1; i++) {
            for (int j = i + 1; j < arr1.length; j++) {
                if (arr1[i] < arr1[j]) {
                    int temp = arr1[i];
                    arr1[i] = arr1[j];
                    arr1[j] = temp;
                }
            }
        }


        for (int i = 0; i < arr2.length - 1; i++) {
            for (int j = i + 1; j < arr2.length; j++) {
                if (arr2[i] < arr2[j]) {
                    int temp = arr2[i];
                    arr2[i] = arr2[j];
                    arr2[j] = temp;
                }
            }
        }

       
        int[] merged = new int[arr1.length + arr2.length];

        for (int i = 0; i < arr1.length; i++) {
            merged[i] = arr1[i];
        }

        for (int i = 0; i < arr2.length; i++) {
            merged[arr1.length + i] = arr2[i];
        }

        System.out.println("\nFirst array (Descending):");
        for (int num : arr1) {
            System.out.print(num + " ");
        }

        System.out.println("\nSecond array (Descending):");
        for (int num : arr2) {
            System.out.print(num + " ");
        }

        System.out.println("\nMerged array:");
        for (int num : merged) {
            System.out.print(num + " ");
        }

        sc.close();
    }
}