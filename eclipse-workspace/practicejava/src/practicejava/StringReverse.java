package practicejava;

public class StringReverse {

	public static void main(String[] args)
	{
		String country="United States";
		//for (int i=1;i<country.length();i++)//output nited States
		//for (int i=0;i<4;i++)//output unit
		for(int i=country.length()-1;i>=0;i--)//output in reverse
		{
			//char a1=country.charAt(i);
			//System.out.println(a1);
			//System.out.println(country.charAt(i));
			System.out.print(country.charAt(i));//printing horizontally
	    }
	}

}
