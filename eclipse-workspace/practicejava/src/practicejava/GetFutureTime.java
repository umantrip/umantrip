package practicejava;

import java.util.Date;

public class GetFutureTime 
{

	public static void main(String[] args) 
	{
	 Date d1=new Date();//Predefined class
	 System.out.println(" Displays in the  epoch time format: " + d1.getTime());
	 Date d3=new Date(d1.getTime()+60*60*1000*24*5);
	 System.out.println("Displays Future time by 5 Days: " + d3);
	Date d4=new Date(d1.getTime()-60*60*1000*24*10);
	System.out.println("Displays Past time by 10  Days: " +d4);
	}

}
