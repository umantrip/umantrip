package practicejava;

public class InfiniteForLoop 
{

	public static void main(String[] args) 
	{
		 for (int i = 0; i < Integer.MAX_VALUE; i++) //Approach 1
		 {
	            System.out.println("i = " + i);
	           
	}
		 //Approch 2
		 for (int i = 0; ; i++) 
		 {
	            System.out.println("i = " + i);
	     }
}
}
