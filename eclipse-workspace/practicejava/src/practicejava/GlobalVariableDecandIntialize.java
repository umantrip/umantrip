package practicejava;

public class GlobalVariableDecandIntialize 
{
	// Global variable
    static int a=10;
    static int b=20;
    
    		
    void add()
    {
    	System.out.println("Addition");
    }
	public static void main(String[] args) 
	{
    	
    	GlobalVariableDecandIntialize g1=new GlobalVariableDecandIntialize();
    	g1.add();
	        // Accessing the global variable
	        System.out.println("Addition value of globalVariable: " + (a+b));
	        
	        // Updating the value of the global variable
	        
	        System.out.println("Updated value of globalVariable: " + (10+30));
	        
	       
	    }
	




}
