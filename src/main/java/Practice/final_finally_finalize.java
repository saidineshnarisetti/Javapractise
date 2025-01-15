package Practice;

import java.util.Scanner;
public class final_finally_finalize {
	final int MAX_VALUE = 100;
	 
	final void displayMessage() {
			
	        System.out.println("This is a final method.");
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final_finally_finalize example = new final_finally_finalize();
		int MAX_VALUE = 1000;
		
		System.out.println(example.MAX_VALUE);
		example.displayMessage();
		
		
		Scanner scanner = new Scanner(System.in);
		try {
            System.out.print("Enter a number: ");
            int num = scanner.nextInt();

            // Attempting to perform a division
            int result = 10 / num;
            System.out.println("Result of division: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");
        } finally {
            // This block will be executed regardless of whether an exception occurs or not
            // It is often used for cleanup operations or releasing resources
            System.out.println("Finally block executed.");

            // Closing the scanner (cleanup operation)
            scanner.close();
        }

	}

}
