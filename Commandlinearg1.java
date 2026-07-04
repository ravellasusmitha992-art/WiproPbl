package Languagebasics;

public class Commandlinearg1 {

		    public static void main(String[] args) {

		       
		        if (args.length < 2) {
		            System.out.println("Please enter two command line arguments");
		        } else {

		        
		            String company = args[0];
		            String city = args[1];

		            
		            System.out.println(company + " Technologies " + city);
		        }
		    }
		}