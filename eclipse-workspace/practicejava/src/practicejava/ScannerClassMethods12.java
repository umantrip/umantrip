package practicejava;

import java.util.Scanner;

public class ScannerClassMethods12
{
	
	    
	    // Static method to demonstrate Scanner methods
	    public static void ScannerMethods() {
	        // Creating a Scanner object for standard input
	        Scanner scanner = new Scanner(System.in);
	        
	        // Demonstrate methods
	        System.out.print("Enter an integer: ");
	        int intValue = scanner.nextInt();
	        System.out.println("Entered integer: " + intValue);

	        System.out.print("Enter a double: ");
	        double doubleValue = scanner.nextDouble();
	        System.out.println("Entered double: " + doubleValue);

	        System.out.print("Enter a boolean (true/false): ");
	        boolean boolValue = scanner.nextBoolean();
	        System.out.println("Entered boolean: " + boolValue);

	        System.out.print("Enter a word: ");
	        String word = scanner.next();
	        System.out.println("Entered word: " + word);

	        System.out.print("Enter a line: ");
	        String line = scanner.nextLine(); // Consumes the newline character left from previous input
	        line = scanner.nextLine(); // Read actual input line
	        System.out.println("Entered line: " + line);

	        // Close the Scanner to prevent resource leak
	        scanner.close();
	    }

	    // Main method to test the utility class
	    public static void main(String[] args)
	    {
	        ScannerMethods();
	    }
	}
	
	
	
	
	
	
	
	
	
	
	
	

