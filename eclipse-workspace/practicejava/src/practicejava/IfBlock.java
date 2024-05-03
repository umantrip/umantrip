package practicejava;

public class IfBlock {

	public static void main(String[] args)
	{
		int i = 6;
		if (i>10)
		{
			System.out.println("Hello");
		}
		//If condition is true it show case
		int a=10;
		int b=20;
		int c=30;
		if(a<b)
		{
			System.out.println("Yes a value is less than b");
		}
		if(a>b)
		{
			System.out.println("No a value is not greater than b");
		}
		if(c>=b)
		{
			System.out.println("Yes c is greater than b");
		}
		if(c<=b)
		{
			System.out.println("No");
		}
		if(c==b)
		{
			System.out.println("Not");
		}
		if(a!=b)
		{
			System.out.println("Yes");
		}
	}

}
