package practicejava;

public class StringReverseVertically 
{
	static void reverse_vertical_name()//static method
	{
		String input="Priya";
		for(int i=input.length()-1; i>=0; i--)//Indexing 4 for priya 5-1
		{
			char a1=input.charAt(i);
			System.out.println(a1);
		}
		
	}
	public static void main(String[] args) 
	{
		System.out.println("Name printed reverse name Vertically: ");
		reverse_vertical_name();
		

	}

}
