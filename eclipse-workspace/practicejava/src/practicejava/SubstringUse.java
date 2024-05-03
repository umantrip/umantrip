package practicejava;

public class SubstringUse 
{

	public static void main(String[] args) 
	{
		String name1="Manish Kumar Tiwari";
		System.out.println(name1.substring(5));//index of 5 is h so it prints from h
		System.out.println(name1.substring(2, 6));//index starts from 2 to 6 here end index will be 6-1 so index 5 will printand prints 
		System.out.println(name1.subSequence(7, 12));
		System.out.println(name1.substring(13));
		System.out.println(name1.subSequence(0, 2));//End index-1 so 2-1=index 1 will print

	}

}
