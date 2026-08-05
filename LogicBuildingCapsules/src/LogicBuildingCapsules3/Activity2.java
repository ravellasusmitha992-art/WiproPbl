package LogicBuildingCapsules3;
import java.util.Scanner;


public class Activity2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

        int[] arr = new int[20];

        System.out.println("Enter 20 integers:");

        for (int i = 0; i < 20; i++) {
            arr[i] = sc.nextInt();
        }

        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        int max3 = Integer.MIN_VALUE;

        int min1 = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;
        int min3 = Integer.MAX_VALUE;

        for (int i = 0; i < 20; i++) {

            // Find 3 maximum elements
            if (arr[i] > max1) {
                max3 = max2;
                max2 = max1;
                max1 = arr[i];
            } else if (arr[i] > max2) {
                max3 = max2;
                max2 = arr[i];
            } else if (arr[i] > max3) {
                max3 = arr[i];
            }

            // Find 3 minimum elements
            if (arr[i] < min1) {
                min3 = min2;
                min2 = min1;
                min1 = arr[i];
            } else if (arr[i] < min2) {
                min3 = min2;
                min2 = arr[i];
            } else if (arr[i] < min3) {
                min3 = arr[i];
            }
        }

        System.out.println("Largest 3 elements: " + max1 + " " + max2 + " " + max3);
        System.out.println("Smallest 3 elements: " + min1 + " " + min2 + " " + min3);

        sc.close();
    }
}
