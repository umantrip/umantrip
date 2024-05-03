package practicejava;

import java.util.Scanner;

public class ArrayAtRuntime 
{
	//Array at runtime using Scanner Class
	public static void main(String[] args) 
	{
	Scanner s1=new Scanner(System.in);
	int rollno[] =new int[3];
	for(int i=0;i<3; i++)
	{
		System.out.println("Enter the Array-->"+i);
		rollno[i]=s1.nextInt();
	}
	rollno[0]=s1.nextInt();
	rollno[1]=s1.nextInt();
	rollno[2]=s1.nextInt();
	System.out.println("Printed the Array");
	}

}
