package practicejava;

import java.util.Scanner;

 public class ScannerClassMethods
{

	public static void main(String[] args)
	{
		 	// Crating a scanner object
		    Scanner sc1 = new Scanner(System.in);

		    System.out.println("Enter name: ");

		    // String input
		    String name = sc1.nextLine();
		    
		    System.out.println("Enter the age ");
		    int age = sc1.nextInt();
		    // Numerical input
		    
		    System.out.println("Enter the salary:");
		    double salary = sc1.nextDouble();

		    // Output input by user
		    System.out.println("Name: " + name);
		    System.out.println("Age: " + age);
		    System.out.println("Salary: " + salary);
		  }
		

	}


