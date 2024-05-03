package practicejava;

public class ReverseaString {
    
	//public static void main(String[] args) 
	/*{
		String input ="Priya";
		for (int i=0; i>input.length()-1; i--)
		{
			char a1=input.charAt(i);
			System.out.println(a1);
		}
*/
	//public class ReverseaString {
	    public static void main(String[] args) 
	    {
	        String input = "Priya";
	        String reverse=" ";
	        for (int i=0;i<=input.length()-1; i--) 
	        {
	        	reverse += input.charAt(i); // Corrected method name to charAt
	            System.out.println("Reversed string: " + reverse);
	        }
	    }
	
	}


