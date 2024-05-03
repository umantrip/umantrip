package practicejava;

import java.util.Date;

public class DateClass {

	public static void main(String[] args) 
	{
		Date d1=new Date();//Present Date
		System.out.println(d1);
		System.out.println(d1.getTime());//epoach timeor server time
		String input=d1.toString();
		System.out.println(input);
		String month=input.substring(4, 7);//index starts 4+1for the begining
		System.out.println(month);
		String date=input.substring(8, 10);//Prints Date
		System.out.println(date);
		String year=input.substring(24);
		System.out.println(year);
		System.out.println(date.concat(" ").concat(month).concat(" ").concat(year));
	}
	
	

}
