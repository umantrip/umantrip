package practicejava;

public class MainMethodOverloading //22nd April
{

	public static void main(String[] args)
	{
		
		        // Calling the main method with integer argument
		        main(5);
		        
		        // Calling the main method with string argument
		        main("Hello");
		        
		        // Calling the main method with double argument
		        main(3.14);
		    }
		    
		    // Main method with integer argument
		    public static void main(int x) 
		    {
		        System.out.println("Main method 1 with int argument: " + x);
		    }
		    
		    // Main method with string argument
		    public static void main(String str) {
		        System.out.println("Main method 2 with String argument: " + str);
		    }
		    
		    // Main method with double argument
		    public static void main(double y) {
		        System.out.println("Main method 3 with double argument: " + y);

	}

}
