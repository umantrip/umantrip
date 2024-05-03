package practicejava;

public class MathClass 
{

	public static void main(String[] args) 
	{
		System.out.println(Math.PI);//Prints the PI value
		double pi=Math.PI;
		System.out.println(pi);//Another way
		System.out.println(Math.addExact(1001,78547));//Prints the addition of integer value
		System.out.println(Math.addExact(748547854, 85748859));//Adding two long values
		System.out.println(Math.subtractExact(800,700));//Subtract
		System.out.println(Math.multiplyExact(100, 9));
		System.out.println(Math.sqrt(100));//Calculates the square root of 100
		System.out.println(Math.max(63, 93));//Prints the max value in the given integer nos
		System.out.println(Math.min(90,100));//Prints the minimum value from the given two integer nos
		System.out.println(Math.random());
		for(int i=0;i<2;i++)
		{
		System.out.println(Math.random());
		}
		
	}

}
