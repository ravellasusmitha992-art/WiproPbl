package test;
import dao.UserDAO;
public class Main {

	 public static void main(String[] args) {

	        UserDAO dao = new UserDAO();

	        String userType = dao.getUserType("AB1001"); 

	        if (userType != null) {
	            System.out.println("User Type : " + userType);
	        } else {
	            System.out.println("User Not Found");
	        }
	    }
	}