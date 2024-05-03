package practicejava;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExcepTryCatch30 
{

	public static void main(String[] args) 
	{
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter The String Value:");
		
		try  // If no exception try block will execute
		{
			int number=s1.nextInt();
			String name[] = new String[number];
			name[0]="Utkarsha1235";
			name[1]="Sandhya1234";
			name[2]="Jassy12345";
			name[3]="Simba123";
			System.out.println(Arrays.toString(name));
			System.out.println("There is no Exception to handle");
		}
		catch(InputMismatchException m1)// If there is an Exception Then catch block will execute
		{
			System.out.println("Handling the Exception");
		}
		try
		{
			int c=1/0;
			System.out.println(c);
		}
		catch(ArithmeticException A1)
		{
			System.out.println("Handling Arithmetic Exception");
			System.out.println("Exception");
		}
				
		}
	}


