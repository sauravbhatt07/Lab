package March23Lab;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Question1 { //main class
	    public static void main(String[] args) { //main method
	        Scanner sc = new Scanner(System.in); // take scannner class for taking user input
	        int x, y; //take instance variable for x, y variables
	        try {    // take try catch for exception
	            x = sc.nextInt();  
	            y = sc.nextInt();
	            if (y == 0) {    
	                throw new ArithmeticException("/ by zero");
	            }
	            int result = x / y;
	            System.out.println(result);
	        } catch (InputMismatchException e) {
	            System.out.println("Input Mismatch Exception");
	        } catch (ArithmeticException e) {
	        	// print
	           System.out.println("Exception caught: " + e.getMessage());
	        }}}
	        