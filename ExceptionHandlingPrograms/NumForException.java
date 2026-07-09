package Exceptionhandling;

public class NumForException {
	    public static void main(String[] args) {
	        try {
	            String[] arr = {"10", "abc", "30"};
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