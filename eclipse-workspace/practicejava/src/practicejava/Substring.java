package practicejava;

public class Substring {

	public static void main(String[] args) 
	{
		String name="Manish Kumar Tiwari";
		String n1="Simba My Boy";
		String n2="I Love Automation Testing";
		System.out.println(name.substring(1));//O/P is anish Kumar Tiwari
		System.out.println(n1.substring(1,6));// O/P is imba
		System.out.println(n2.substring(0,16));//O/P I Love Automation
	}

}
