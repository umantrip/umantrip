package practicejava;

public class SubstringEx 
{

	public static void main(String[] args) 
	{
		String name="Manish Kumar Tiwari";
		System.out.println("Prints the name as per the indexing Position:");
		System.out.println((name.substring(1)));
		//name.substring(1);//Return Type is String with single index value in int
	System.out.println((name.substring(7, 12)));
	}

}
