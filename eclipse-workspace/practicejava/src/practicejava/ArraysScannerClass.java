package practicejava;

import java.util.Scanner;

public class ArraysScannerClass {

	public static void main(String[] args) 
	{
		Scanner s2=new Scanner(System.in);
		System.out.println("Enter the Size of the Array:  ");
		int size =s2.nextInt();
		int[] array =new int[size];
		System.out.println("Enter the elements of the Array:  ");
		for (int i =0; i<size; i++)
		{
			array[i] = s2.nextInt();
		}
		//array[0]=s2.nextInt();
		//array[1]=s2.nextInt();
		//array[2]=s2.nextInt();
		System.out.println("Array elements:  ");
		for ( int i=0; i<size; i++)
		{
			System.out.println(array[i] + " ");
		}
	}

}
