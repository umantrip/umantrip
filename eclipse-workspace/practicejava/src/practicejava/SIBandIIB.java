package practicejava;

public class SIBandIIB 
{
	SIBandIIB ()
	{
		System.out.println("Its a Constructor");//constructor
	}
	static 
	{
		System.out.println("Static Instance Block"); //SIB
	}
	
	{
		System.out.println("Instance Initial Block");//IIB
	}
	public static void main(String[] args) 
	{
		System.out.println("Its Main Method");//main Method
		SIBandIIB  i1=new SIBandIIB ();
		
	}
}
	