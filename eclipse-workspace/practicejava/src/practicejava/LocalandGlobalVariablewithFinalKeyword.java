package practicejava;

public class LocalandGlobalVariablewithFinalKeyword 
{
	// Global variable with final keyword
    public static final int NUMBER = 10;
	public static void main(String[] args) 
	{
		 // Calling the method with a final local variable
        int number = 10;
        displayNumber(number);
    }
    
    public static void displayNumber(final int num) 
    {
        // Using a final local variable
        System.out.println("Number from displayNumber method: " + num);
    }
}

