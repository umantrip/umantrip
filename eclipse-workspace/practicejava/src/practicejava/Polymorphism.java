package practicejava;

public class Polymorphism 
{
	static void log_in()
	{
		System.out.println("Login with the mobile number");
	}
	static void log_in(int a)
	{
		System.out.println("Login with the mobile number and country code");
	}
	static void log_in(int a, int b)
	{
		System.out.println("Login withe the email id");
	}
	public static void main(String[] args) 
	{
		log_in();
		log_in(10);
		log_in(20, 45);
		
	}
}
