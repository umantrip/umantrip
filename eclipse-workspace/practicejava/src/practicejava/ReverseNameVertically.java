package practicejava;

public class ReverseNameVertically 
{
	static void reverseverticalname()
	 {
	        String input = "Priya";// String input

	        for (int i = input.length() -1; i >= 0; i--) //For loop to reverse a String Vertically
	        {
	            System.out.println(input.charAt(i));//Prints the String
	        }
	    }

	    public static void main(String[] args) 
	    {
	        reverseverticalname();//Calling a static method inside a main method to invoke the method.
	        
	        System.out.println("= = = = = = = =");
	        //String input="Priya";
	    }
	    
	    
	    
	
	
	
		

	}


