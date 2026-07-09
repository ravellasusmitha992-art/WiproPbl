package Exceptionhandling;

public class ExceptionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		        try {
		            int n = 3;

		            String[] arr = {"10", "20", "30"};

		            int index = 1;

		            System.out.println("The array element at index " + index + " = " + Integer.parseInt(arr[index]));
		            System.out.println("The array element successfully accessed");

		        } catch (ArrayIndexOutOfBoundsException e) {
		            System.out.println("java.lang.ArrayIndexOutOfBoundsException");
		        } catch (NumberFormatException e) {
		            System.out.println("java.lang.NumberFormatException");
		        }
		    }
		}

	