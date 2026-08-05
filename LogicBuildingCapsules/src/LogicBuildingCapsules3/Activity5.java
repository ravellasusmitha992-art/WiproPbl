package LogicBuildingCapsules3;
import java.util.Scanner;
public class Activity5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

        int marks[] = new int[30];
        int count[] = new int[10];

        System.out.println("Enter 30 marks:");

        for (int i = 0; i < 30; i++) {
            marks[i] = sc.nextInt();

            if (marks[i] <= 10)
                count[0]++;
            else if (marks[i] <= 20)
                count[1]++;
            else if (marks[i] <= 30)
                count[2]++;
            else if (marks[i] <= 40)
                count[3]++;
            else if (marks[i] <= 50)
                count[4]++;
            else if (marks[i] <= 60)
                count[5]++;
            else if (marks[i] <= 70)
                count[6]++;
            else if (marks[i] <= 80)
                count[7]++;
            else if (marks[i] <= 90)
                count[8]++;
            else
                count[9]++;
        }

        System.out.println("0-10 = " + count[0]);
        System.out.println("11-20 = " + count[1]);
        System.out.println("21-30 = " + count[2]);
        System.out.println("31-40 = " + count[3]);
        System.out.println("41-50 = " + count[4]);
        System.out.println("51-60 = " + count[5]);
        System.out.println("61-70 = " + count[6]);
        System.out.println("71-80 = " + count[7]);
        System.out.println("81-90 = " + count[8]);
        System.out.println("91-100 = " + count[9]);

        sc.close();
    }

	}


