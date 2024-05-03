package practicejava;

import java.util.Arrays;

public class ReversePartialString
{

	public static void main(String[] args)
	{
		String name="sandhya";
		char[] c1=name.toCharArray();
		System.out.println(Arrays.toString(c1));
		String name1=name.substring(1, 4);
		String name2=name.substring(4, 7);
		System.out.println(name1);
		System.out.println(name.charAt(0)+name1.toUpperCase()+name2);

	}

}
