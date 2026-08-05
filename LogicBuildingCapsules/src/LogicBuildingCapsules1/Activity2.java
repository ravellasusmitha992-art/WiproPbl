package LogicBuildingCapsules1;
import java.util.Scanner;

public class Activity2 {

	public static void main(String[] args) {
		// TODO Auto-generated method st
		        Scanner sc=new Scanner(System.in);
		        int count=0;
		       for(int i=1;i<=3;i++){
		    	   System.out.println("Enter Student marks : "+i);
		    	   int marks=sc.nextInt();
		        if(marks>=35){
		            count++;
		        }
		
		        System.out.println("Number of passing students: " + count);
		       
		    }
	
	}
}
