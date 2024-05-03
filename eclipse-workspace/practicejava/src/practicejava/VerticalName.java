package practicejava;

public class VerticalName 
{

	public static void main(String[] args) 
	
	{

    	//Prints Vertically
    	/*System.out.println("1");
    	System.out.println("2");
    	System.out.println("3");
    	
    	//Prints Horizontally
    	System.out.print("1");
    	System.out.print("2");
    	System.out.print("3");
*/


		String input= "Priya"; // Input String Declaration
		

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            System.out.println("Character at index " + i + ": " + ch);
	    }
	}

}
