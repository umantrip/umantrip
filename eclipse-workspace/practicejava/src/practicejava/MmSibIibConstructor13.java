package practicejava;

public class MmSibIibConstructor13 
{
	
	    static 
	    {
	        System.out.println("Static Initialization Block");
	    }

	    {
	        System.out.println("Instance Initialization Block");
	    }

	    public MmSibIibConstructor13 () {
	        System.out.println("Constructor");
	    }

	    public static void main(String[] args) {
	        System.out.println("Main Method");
	        MmSibIibConstructor13  m1 = new MmSibIibConstructor13 ();
	    }
	
	

}
